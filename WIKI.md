# 📚 Wiki del Proyecto - Higher Order Functions y Método de Simpson

## Índice
1. [¿Qué son las Higher Order Functions?](#1-qué-son-las-higher-order-functions)
2. [Fundamento Matemático del Método de Simpson](#2-fundamento-matemático-del-método-de-simpson)
3. [Análisis del Código](#3-análisis-del-código)
4. [Errores y Precisión](#4-errores-y-precisión)
5. [Ventajas de la Programación Funcional](#5-ventajas-de-la-programación-funcional)

---

## 1. ¿Qué son las Higher Order Functions?

### Definición
Una **Higher Order Function** (HOF) es una función que cumple al menos una de estas condiciones:
- **Recibe una o más funciones como parámetros**
- **Retorna una función como resultado**

### En este Proyecto
Nuestra función `integracion` es una HOF porque **recibe una función como parámetro**:

```scala
def integracion(a: Double, b: Double, f: Double => Double): Double
```

El tercer parámetro `f: Double => Double` es una función que:
- Recibe un `Double` (valor de x)
- Retorna un `Double` (valor de f(x))

### ¿Por qué es útil?
Sin HOF, tendríamos que escribir una función diferente para cada integral:

```scala
// ❌ SIN Higher Order Functions (Malo)
def integralPolinomio(a: Double, b: Double): Double = { ... }
def integralExponencial(a: Double, b: Double): Double = { ... }
def integralTrigonometrica(a: Double, b: Double): Double = { ... }
```

Con HOF, **una sola función** sirve para todas:

```scala
// ✅ CON Higher Order Functions (Bueno)
integracion(3, 5, x => -x*x + 8*x - 12)     // Polinomio
integracion(0, 1, x => exp(x))               // Exponencial
integracion(0, 1, x => 1/(1 + x*x))          // Racional
```

---

## 2. Fundamento Matemático del Método de Simpson

### Fórmula General

$$
\int_{a}^{b} f(x) dx \cong (b-a) \frac{f(a) + 4f(\bar{x}) + f(b)}{6}
$$

Donde: $\bar{x} = \frac{a+b}{2}$

### ¿Cómo funciona?

El método aproxima la función mediante una **parábola** que pasa por tres puntos:

1. **Punto inicial:** $(a, f(a))$
2. **Punto medio:** $(\bar{x}, f(\bar{x}))$ donde $\bar{x} = \frac{a+b}{2}$
3. **Punto final:** $(b, f(b))$

### Ejemplo Paso a Paso

Calcular: $\int_{3}^{5} (-x^2 + 8x - 12) dx$

**Paso 1:** Identificar límites
- $a = 3$
- $b = 5$

**Paso 2:** Calcular punto medio
$$\bar{x} = \frac{3 + 5}{2} = 4$$

**Paso 3:** Evaluar la función en los tres puntos
- $f(3) = -(3)^2 + 8(3) - 12 = -9 + 24 - 12 = 3$
- $f(4) = -(4)^2 + 8(4) - 12 = -16 + 32 - 12 = 4$
- $f(5) = -(5)^2 + 8(5) - 12 = -25 + 40 - 12 = 3$

**Paso 4:** Aplicar la fórmula de Simpson
$$\int_{3}^{5} f(x) dx \cong (5-3) \frac{3 + 4(4) + 3}{6}$$

$$= 2 \cdot \frac{3 + 16 + 3}{6} = 2 \cdot \frac{22}{6} = \frac{44}{6} \approx 7.333$$

**Resultado:** 7.333 (muy cercano al esperado 7.33)

### ¿Por qué es preciso?

El método de Simpson es **exacto** para polinomios de grado ≤ 3. Esto significa:
- ✅ Exacto para: constantes, funciones lineales, cuadráticas y cúbicas
- ≈ Aproximado para: funciones de mayor grado, exponenciales, trigonométricas, etc.

---

## 3. Análisis del Código

### Estructura de Simpson.sc

```scala
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val xBarra = (a + b) / 2.0                      // Punto medio
  (b - a) * (f(a) + 4 * f(xBarra) + f(b)) / 6.0  // Fórmula de Simpson
}
```

**Línea por línea:**
1. `val xBarra = (a + b) / 2.0` → Calcula $\bar{x}$
2. `(b - a)` → Factor $(b-a)$ de la fórmula
3. `f(a) + 4 * f(xBarra) + f(b)` → Suma ponderada: $f(a) + 4f(\bar{x}) + f(b)$
4. `/ 6.0` → División por 6

### Uso de Funciones Lambda

En Scala, las funciones lambda se definen así:

```scala
(parámetro: Tipo) => expresión
```

**Ejemplos del proyecto:**

```scala
// Función simple: f(x) = x²
val f = (x: Double) => x * x

// Función compuesta: f(x) = -x² + 8x - 12
val f = (x: Double) => -pow(x, 2) + 8*x - 12

// Función exponencial: f(x) = e^x
val f = (x: Double) => exp(x)
```

### Inmutabilidad y Valores

```scala
val integral1 = integracion(3, 5, f1)  // ✅ Inmutable
var integral2 = integracion(0, 2, f2)  // ❌ Evitado en programación funcional
```

En programación funcional preferimos `val` (inmutable) sobre `var` (mutable).

---

## 4. Errores y Precisión

### Función de Cálculo de Error

```scala
def calcularError(esperado: Double, obtenido: Double): Double = {
  abs(esperado - obtenido)
}
```

### Tipos de Error

**Error Absoluto:**
$$E_{abs} = |valorEsperado - valorObtenido|$$

**Error Relativo (%):**
$$E_{rel} = \frac{|valorEsperado - valorObtenido|}{|valorEsperado|} \times 100\%$$

### Análisis de Resultados

| Integral | Error Absoluto | Observación |
|----------|---------------|-------------|
| 1 | ~0.003 | Polinomio grado 2 → muy preciso |
| 2 | ~0.000 | Polinomio grado 2 → exacto |
| 3 | ~0.000 | Polinomio grado 4 → buena precisión |
| 4 | ~0.000 | Función racional → excelente |
| 5 | ~0.000 | Exponencial → muy buena |
| 6 | ~0.000 | Raíz → precisa |
| 7 | ~0.000 | Arcotangente → precisa |

**Conclusión:** El método de Simpson proporciona excelente precisión para intervalos pequeños.

### Limitaciones

1. **Intervalo grande:** Mayor error en intervalos muy grandes
2. **Funciones oscilantes:** Menor precisión con muchas oscilaciones
3. **Singularidades:** Problemas cerca de puntos discontinuos

**Solución:** Simpson compuesto (dividir en subintervalos)

---

## 5. Ventajas de la Programación Funcional

### En este Proyecto

#### 1. **Reutilización de Código**
Una sola función `integracion` sirve para infinitas funciones matemáticas.

#### 2. **Composición**
```scala
calcularError(esperado, integracion(a, b, f))
```
Las funciones se componen naturalmente.

#### 3. **Declaratividad**
```scala
val f = (x: Double) => -pow(x, 2) + 8*x - 12
val resultado = integracion(3, 5, f)
```
El código expresa **QUÉ** queremos calcular, no **CÓMO**.

#### 4. **Inmutabilidad**
Sin efectos secundarios → código más predecible y fácil de probar.

#### 5. **Abstracción**
No nos importa cómo está implementada `f`, solo que cumpla el contrato: `Double => Double`.

### Comparación con Programación Imperativa

**Imperativa (Java/C):**
```java
// ❌ Más verboso, menos flexible
public class Simpson {
    public double integrarPolinomio(double a, double b) {
        double x = (a + b) / 2.0;
        return (b - a) * (polinomio(a) + 4*polinomio(x) + polinomio(b)) / 6.0;
    }
    
    private double polinomio(double x) {
        return -x*x + 8*x - 12;
    }
}
```

**Funcional (Scala):**
```scala
// ✅ Conciso, flexible, reutilizable
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val x = (a + b) / 2.0
  (b - a) * (f(a) + 4*f(x) + f(b)) / 6.0
}

integracion(3, 5, x => -x*x + 8*x - 12)
```

---

## 📝 Conclusiones

1. **Las Higher Order Functions** permiten código más abstracto y reutilizable
2. **El método de Simpson** es preciso y eficiente para integrales simples
3. **Scala** facilita la programación funcional con sintaxis elegante
4. **La inmutabilidad** hace el código más seguro y predecible
5. **La composición de funciones** permite crear soluciones complejas de forma simple

---

## 🔗 Referencias Adicionales

- [Scala Tour - Higher-Order Functions](https://docs.scala-lang.org/tour/higher-order-functions.html)
- [Numerical Integration - MIT OpenCourseWare](https://ocw.mit.edu/)
- [Functional Programming Principles in Scala - Coursera](https://www.coursera.org/learn/scala-functional-programming)
- [Simpson's Rule - Khan Academy](https://www.khanacademy.org/)

---

*Última actualización: Noviembre 2025*

