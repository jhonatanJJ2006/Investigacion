# 🎤 Guión Corto - Exposición Rápida

**⏱️ Tiempo:** 8-10 minutos

---

## 🎬 **EJECUCIÓN Y DISCURSO**

### **1️⃣ Simpson.sc** (1 min)
```bash
scala Investigacion/src/Simpson.sc
```

**💬 Qué decir:**
- "Esta es la función básica de integración"
- "Es una **Higher Order Function** porque recibe la función `f` como parámetro"
- "Aplica la fórmula: (b-a) × [f(a) + 4×f(medio) + f(b)] / 6"

---

### **2️⃣ Ejemplo.sc** (2 min)
```bash
scala Investigacion/src/Ejemplo.sc
```

**💬 Qué decir:**
- "Ejemplo paso a paso de cómo funciona"
- "Calcula la integral de -x² + 8x - 12 entre 3 y 5"
- "Paso 1: Punto medio = 4"
- "Paso 2: Evalúa f(3), f(4), f(5)"
- "Paso 3: Aplica la fórmula y obtiene ~7.33"

---

### **3️⃣ Integrales.sc** (2 min)
```bash
scala Investigacion/src/Integrales.sc
```

**💬 Qué decir:**
- "Aquí calculamos las **7 integrales del trabajo**"
- "7 funciones diferentes, **una sola función de integración**"
- "Esto demuestra el poder de las Higher Order Functions"
- "Todos los resultados son cercanos a los esperados"

---

### **4️⃣ CalculoError.sc** (2 min)
```bash
scala Investigacion/src/CalculoError.sc
```

**💬 Qué decir:**
- "Ahora calculamos los **errores de aproximación**"
- "Error = |esperado - obtenido|"
- "Los errores son muy pequeños"
- "Integral 2 tiene error cero porque Simpson es exacto para polinomios grado ≤ 3"

---

### **5️⃣ Test.sc** (2 min)
```bash
scala Investigacion/src/Test.sc
```

**💬 Qué decir:**
- "Tests de verificación para asegurar que funciona"
- "Usa **programación funcional pura**: sin var, solo val"
- "Cada test verifica si el error es menor a 0.01"
- "**Todos los tests pasaron** ✓"

---

## 🎯 **CONCLUSIÓN** (1 min)

**💬 Qué decir:**
> "Hemos demostrado tres conceptos clave:"

**1. Higher Order Functions**
- Funciones que reciben funciones como parámetros

**2. Funciones Anónimas**
- `(x: Double) => x*x`

**3. Programación Funcional**
- Inmutabilidad (val)
- Sin efectos secundarios
- Código reutilizable

> "El Método de Simpson es preciso y la programación funcional nos permite implementarlo de forma elegante."

> "¿Preguntas?"

---

## 📋 **CHECKLIST PRE-EXPOSICIÓN**

Antes de presentar:
- [ ] Scala funciona: `scala -version`
- [ ] Todos los archivos ejecutan sin error
- [ ] Terminal lista en el directorio correcto
- [ ] Guión impreso o en otra pantalla
- [ ] Agua/café si es necesario

---

## ❓ **RESPUESTAS RÁPIDAS**

**¿Qué es Higher Order Function?**
→ Función que recibe otra función como parámetro

**¿Por qué Simpson 1/3?**
→ Usa parábola, más preciso que líneas rectas

**¿Qué es `Double => Double`?**
→ Tipo de función: recibe Double, retorna Double

**¿Cómo funciona Simpson?**
→ Evalúa en 3 puntos (a, medio, b), peso 4 al medio

---

## 💡 **TIPS CLAVE**

✅ **Habla despacio y claro**
✅ **Señala la pantalla cuando expliques**
✅ **Mantén contacto visual**
✅ **Si falla algo, mantén la calma**
✅ **No leas el guión literalmente**

---

## ⏱️ **TIEMPOS**

| Archivo | Tiempo | Acumulado |
|---------|--------|-----------|
| Intro | 0:30 | 0:30 |
| Simpson.sc | 1:00 | 1:30 |
| Ejemplo.sc | 2:00 | 3:30 |
| Integrales.sc | 2:00 | 5:30 |
| CalculoError.sc | 2:00 | 7:30 |
| Test.sc | 2:00 | 9:30 |
| Conclusión | 1:00 | 10:30 |

---

**🚀 ¡Éxito en tu presentación!**

