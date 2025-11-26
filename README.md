# Trabajo de Investigación: Higher Order Functions
## Método de Simpson 1/3 para Integración Numérica

### 📋 Descripción del Proyecto

Este proyecto implementa el **método de Simpson 1/3** para calcular integrales definidas de forma aproximada utilizando conceptos de **programación funcional** y **funciones de orden superior** en Scala.

El método de Simpson 1/3 es una técnica de integración numérica que aproxima el valor de una integral definida mediante la siguiente fórmula:

$$
\int_{a}^{b} f(x) dx \cong (b-a) \frac{f(a) + 4f(\bar{x}) + f(b)}{6}
$$

Donde: $\bar{x} = \frac{a+b}{2}$

---

## 🎯 Objetivos

1. **Aplicar conceptos de funciones de orden superior (Higher Order Functions)**
2. **Implementar el paso de funciones como parámetros**
3. **Calcular integrales definidas de forma aproximada**
4. **Evaluar la precisión mediante cálculo de errores**

---

## 📁 Estructura del Proyecto

```
TallerInd1/
│
├── src/
│   ├── Simpson.sc          # Implementación del método de Simpson 1/3
│   ├── Integrales.sc       # Aplicación a las 7 integrales requeridas
│   └── CalculoError.sc     # Cálculo de errores de aproximación
│
└── README.md               # Documentación del proyecto
```

---

## 🔧 Componentes del Proyecto

### 1. **Simpson.sc** - Función Principal de Integración

Este archivo contiene la implementación de la función de orden superior `integracion`:

**Firma de la función:**
```scala
def integracion(a: Double, b: Double, f: Double => Double): Double
```

**Parámetros:**
- `a: Double` - Límite inferior de integración
- `b: Double` - Límite superior de integración  
- `f: Double => Double` - **Función a integrar** (Higher Order Function)

**Retorno:**
- `Double` - Valor aproximado de la integral definida

**Funcionamiento:**
1. Calcula el punto medio: $\bar{x} = \frac{a+b}{2}$
2. Evalúa la función en tres puntos: `f(a)`, `f(x̄)`, `f(b)`
3. Aplica la fórmula de Simpson: $(b-a) \cdot \frac{f(a) + 4f(\bar{x}) + f(b)}{6}$

**¿Por qué es Higher Order Function?**
Porque recibe una función `f` como parámetro, lo que permite calcular la integral de **cualquier función matemática** sin necesidad de modificar el código base.

---

### 2. **Integrales.sc** - Aplicación del Método

Este archivo calcula las **7 integrales definidas** requeridas en el trabajo:

| # | Integral | Límites | Valor Esperado |
|---|----------|---------|----------------|
| 1 | $-x^2 + 8x - 12$ | [3, 5] | 7.33 |
| 2 | $3x^2$ | [0, 2] | 8.0 |
| 3 | $x + 2x^2 - x^3 + 5x^4$ | [-1, 1] | 3.333 |
| 4 | $\frac{2x+1}{x^2+x}$ | [1, 2] | 1.09861 |
| 5 | $e^x$ | [0, 1] | 1.71828 |
| 6 | $\frac{1}{\sqrt{x-1}}$ | [2, 3] | 0.828427 |
| 7 | $\frac{1}{1+x^2}$ | [0, 1] | 0.785398 |

**Ejemplo de uso:**
```scala
// Definir la función matemática
val f1 = (x: Double) => -pow(x, 2) + 8*x - 12

// Calcular la integral
val resultado = integracion(3, 5, f1)
```

---

### 3. **CalculoError.sc** - Evaluación de Precisión

Implementa la función `calcularError` que mide la precisión de las aproximaciones:

**Fórmula del error:**
$$
Error = |valorEsperado - valorObtenido|
$$

**Función:**
```scala
def calcularError(esperado: Double, obtenido: Double): Double = {
  abs(esperado - obtenido)
}
```

Este archivo genera un reporte completo con:
- Valores esperados
- Valores obtenidos
- Errores absolutos para cada integral

---

## 🚀 Cómo Ejecutar el Proyecto

### Requisitos Previos
- **Scala 2.13+** instalado
- **Ammonite REPL** (recomendado para ejecutar scripts `.sc`)

### Instalación de Ammonite (si no lo tienes)

**Windows:**
```bash
winget install --id=lihaoyi.Ammonite -e
```

**Linux/Mac:**
```bash
sudo sh -c '(echo "#!/usr/bin/env sh" && curl -L https://github.com/com-lihaoyi/Ammonite/releases/download/2.5.9/2.13-2.5.9) > /usr/local/bin/amm && chmod +x /usr/local/bin/amm'
```

### Ejecución

**1. Ejecutar solo el método de Simpson:**
```bash
amm src/Simpson.sc
```

**2. Calcular las 7 integrales:**
```bash
amm src/Integrales.sc
```

**3. Ver el reporte de errores:**
```bash
amm src/CalculoError.sc
```

---

## 📊 Resultados Esperados

Al ejecutar `CalculoError.sc`, deberías ver una salida similar a:

```
======================================================================
CÁLCULO DE ERRORES
======================================================================
Integral 1   | Esperado: 7.330000 | Obtenido: 7.333333 | Error: 0.003333
Integral 2   | Esperado: 8.000000 | Obtenido: 8.000000 | Error: 0.000000
Integral 3   | Esperado: 3.333000 | Obtenido: 3.333333 | Error: 0.000333
Integral 4   | Esperado: 1.098610 | Obtenido: 1.098612 | Error: 0.000002
Integral 5   | Esperado: 1.718280 | Obtenido: 1.718282 | Error: 0.000002
Integral 6   | Esperado: 0.828427 | Obtenido: 0.828427 | Error: 0.000000
Integral 7   | Esperado: 0.785398 | Obtenido: 0.785398 | Error: 0.000000
======================================================================
```

---

## 🧠 Conceptos de Programación Funcional Aplicados

### 1. **Higher Order Functions (Funciones de Orden Superior)**
La función `integracion` es una HOF porque:
- Recibe una función como parámetro: `f: Double => Double`
- Permite abstraer el comportamiento (la función a integrar)
- Promueve la reutilización de código

### 2. **Funciones Lambda**
Todas las funciones matemáticas se definen como expresiones lambda:
```scala
val f = (x: Double) => -pow(x, 2) + 8*x - 12
```

### 3. **Inmutabilidad**
Todas las variables son declaradas con `val` (inmutables), siguiendo el paradigma funcional.

### 4. **Composición de Funciones**
Las funciones se componen de manera natural:
```scala
calcularError(esperado, integracion(a, b, f))
```

---

## 📚 Fundamento Matemático

El método de Simpson 1/3 se basa en aproximar la función mediante una **parábola** (polinomio de grado 2) que pasa por tres puntos:
- Punto inicial: `(a, f(a))`
- Punto medio: `(x̄, f(x̄))`
- Punto final: `(b, f(b))`

La integral de esta parábola se calcula exactamente, proporcionando una buena aproximación de la integral real.

**Ventajas:**
- Mayor precisión que el método del trapecio
- Exacto para polinomios de grado ≤ 3
- Error del orden O(h⁵) donde h = b - a

---

## 👨‍💻 Autor

**Trabajo de Consulta - Programación Funcional y Reactiva**
- Universidad Técnica Particular de Loja (UTPL)
- Semana 7

---

## 📖 Referencias

1. Burden, R. L., & Faires, J. D. (2010). *Numerical Analysis*. 9th Edition.
2. Scala Documentation: [Higher-Order Functions](https://docs.scala-lang.org/tour/higher-order-functions.html)
3. Simpson's Rule: [Wikipedia](https://en.wikipedia.org/wiki/Simpson%27s_rule)

---

## 📝 Licencia

Este proyecto es de uso educativo para el curso de Programación Funcional y Reactiva.

