# 🎤 Guión de Exposición - Método de Simpson 1/3

**Tiempo estimado:** 8-10 minutos  
**Archivos a demostrar:** 5 archivos .sc

---

## 📋 **INTRODUCCIÓN** (1 minuto)

### **Saludo y Presentación**
> "Buenos días/tardes. Hoy voy a presentar mi trabajo sobre el **Método de Simpson 1/3** aplicando **Higher Order Functions** en Scala."

### **Tema Principal**
> "El objetivo es demostrar cómo usar **funciones de orden superior**, que son funciones que **reciben otras funciones como parámetros**."

### **Estructura de la Presentación**
> "Voy a mostrar 5 archivos que van desde lo más simple hasta lo más completo:
> 1. La función básica
> 2. Un ejemplo paso a paso
> 3. Las 7 integrales del trabajo
> 4. Cálculo de errores
> 5. Tests de verificación"

---

## 📄 **PARTE 1: Simpson.sc** (1 minuto)

### **Preparación**
```bash
scala Investigacion/src/Simpson.sc
```

### **Qué Decir**
> "Empezamos con lo más básico: la función de integración."

> "Esta es una **Higher Order Function** porque recibe como parámetro `f`, que es una función de tipo `Double => Double`."

> "La fórmula de Simpson 1/3 es:
> - Calculamos el punto medio del intervalo
> - Evaluamos la función en 3 puntos: a, medio, y b
> - Aplicamos la fórmula: `(b-a) × [f(a) + 4×f(medio) + f(b)] / 6`"

### **Concepto Clave**
> "¿Por qué es Higher Order Function? Porque **recibe una función como parámetro**. Esto nos permite usar una sola función para calcular infinitas integrales diferentes."

---

## 🔍 **PARTE 2: Ejemplo.sc** (2 minutos)

### **Preparación**
```bash
scala Investigacion/src/Ejemplo.sc
```

### **Qué Decir**
> "Ahora veamos un ejemplo **paso a paso** para entender cómo funciona."

### **Mientras se ejecuta, explica:**

**Paso 1: Definir el problema**
> "Queremos calcular la integral de `f(x) = -x² + 8x - 12` entre 3 y 5."

**Paso 2: Punto medio**
> "Primero calculamos el punto medio: `(3 + 5) / 2 = 4`"

**Paso 3: Evaluar la función**
> "Evaluamos la función en los tres puntos: f(3), f(4), y f(5)"
> "Como pueden ver, obtenemos: [valores que aparecen en pantalla]"

**Paso 4: Aplicar la fórmula**
> "Finalmente aplicamos la fórmula de Simpson y obtenemos el resultado."

**Resultado**
> "El valor obtenido es **muy cercano** al esperado (7.33), con un error mínimo."

---

## 📊 **PARTE 3: Integrales.sc** (2 minutos)

### **Preparación**
```bash
scala Investigacion/src/Integrales.sc
```

### **Qué Decir**
> "Ahora ejecutamos las **7 integrales que pide el trabajo**."

### **Mientras se ejecuta:**
> "Aquí es donde se ve el **poder de las Higher Order Functions**:"

> "Definimos 7 funciones diferentes:
> - Polinomios
> - Funciones racionales
> - Funciones exponenciales
> - Funciones con raíces"

> "Y usamos **la misma función `integracion`** para calcular todas."

### **Señalar en pantalla:**
> "Como pueden ver, todos los resultados son muy cercanos a los valores esperados."

### **Ventaja de Programación Funcional**
> "Sin Higher Order Functions, hubiéramos necesitado escribir 7 funciones diferentes de integración. Con programación funcional, **una sola función sirve para todas**."

---

## 📉 **PARTE 4: CalculoError.sc** (2 minutos)

### **Preparación**
```bash
scala Investigacion/src/CalculoError.sc
```

### **Qué Decir**
> "Ahora calculamos los **errores de aproximación**, que es parte del trabajo."

### **Explicar la función de error:**
> "La función `calcularError` calcula el valor absoluto de la diferencia entre el esperado y el obtenido."

### **Mientras se ejecuta:**
> "Aquí vemos:
> - El valor de cada integral
> - El valor esperado
> - El error de aproximación"

### **Analizar resultados:**
> "Los errores son **muy pequeños**, lo que demuestra que el Método de Simpson es muy preciso."

> "Por ejemplo, para la integral 2, el error es **cero** porque Simpson es **exacto** para polinomios de grado ≤ 3."

---

## ✅ **PARTE 5: Test.sc** (2 minutos)

### **Preparación**
```bash
scala Investigacion/src/Test.sc
```

### **Qué Decir**
> "Finalmente, tenemos **tests de verificación** para asegurar que todo funciona correctamente."

### **Concepto de Programación Funcional:**
> "Este archivo demuestra **programación funcional pura**:"
> - No usamos variables mutables (var)
> - Usamos valores inmutables (val)
> - Cada función retorna un valor sin efectos secundarios"

### **Mientras se ejecuta:**
> "Cada test compara el resultado obtenido con el esperado."

> "Si el error es menor a 0.01, el test **pasa** (✓)."

### **Resultado Final:**
> [Señalar el resumen]
> "Como pueden ver, **todos los tests pasaron**, lo que confirma que nuestra implementación es correcta."

---

## 🎯 **CONCLUSIÓN** (1 minuto)

### **Resumen de Conceptos**
> "En este trabajo hemos demostrado:"

> "**1. Higher Order Functions**
> - La función `integracion` recibe otra función `f` como parámetro
> - Esto permite reutilizar código"

> "**2. Funciones Anónimas (Lambdas)**
> - Definimos funciones sin nombre: `(x: Double) => x*x`
> - Son valores que se pueden pasar como argumentos"

> "**3. Programación Funcional Pura**
> - Inmutabilidad (solo `val`, no `var`)
> - Funciones sin efectos secundarios
> - Composición de funciones"

### **Ventajas del Enfoque Funcional**
> "Las ventajas son:"
> - **Reutilización:** Una función para infinitas integrales
> - **Claridad:** El código es más expresivo
> - **Mantenibilidad:** Fácil de probar y modificar"

### **Cierre**
> "El Método de Simpson 1/3 es muy preciso para aproximar integrales, y la programación funcional nos permite implementarlo de forma elegante y reutilizable."

> "¿Alguna pregunta?"

---

## ❓ **PREGUNTAS FRECUENTES (Por si acaso)**

### **P: ¿Qué es una Higher Order Function?**
**R:** 
> "Es una función que recibe otra función como parámetro o retorna una función. En nuestro caso, `integracion` recibe `f` como parámetro."

### **P: ¿Por qué Simpson 1/3?**
**R:** 
> "Se llama 1/3 por el factor que aparece en la fórmula. Aproxima la integral usando una **parábola** en lugar de una línea recta, por eso es más preciso que métodos simples."

### **P: ¿Qué significa `Double => Double`?**
**R:** 
> "Es el **tipo** de una función que recibe un Double y retorna un Double. Es como decir 'esta función transforma un número en otro número'."

### **P: ¿Por qué no usar `pow(x, 2)`?**
**R:** 
> "Usamos `x*x` porque es más básico, más rápido, y más legible. Es programación funcional simple sin librerías innecesarias."

### **P: ¿Cómo funciona la fórmula de Simpson?**
**R:** 
> "Evalúa la función en 3 puntos (inicio, medio, fin), le da más peso al punto medio (×4), y promedia para obtener el área bajo la curva."

---

## 📝 **TIPS PARA LA EXPOSICIÓN**

### **Antes de Empezar:**
- ✅ Asegúrate de que Scala funcione: `scala -version`
- ✅ Ten todos los archivos listos
- ✅ Practica la ejecución de cada archivo
- ✅ Ten el guión a mano pero no lo leas literalmente

### **Durante la Exposición:**
- 🗣️ Habla claro y despacio
- 👁️ Mantén contacto visual con el docente
- 📺 Muestra la pantalla mientras ejecutas cada archivo
- ⏸️ Pausa después de cada ejecución para explicar resultados
- 🎯 Enfócate en los conceptos clave, no en detalles técnicos

### **Si Algo Sale Mal:**
- 😌 Mantén la calma
- 🔄 Explica qué debería pasar
- 📖 Muestra el código en lugar de ejecutarlo
- 🤔 Si no sabes algo, di "No estoy seguro, pero creo que..."

### **Lenguaje Corporal:**
- 👍 Mantén postura erguida
- 🙂 Sonríe (pero no exageres)
- ✋ Usa tus manos para señalar cosas en la pantalla
- 📍 No te muevas demasiado

---

## 🎬 **ORDEN DE EJECUCIÓN**

```bash
# 1. Función básica
scala Investigacion/src/Simpson.sc

# 2. Ejemplo paso a paso
scala Investigacion/src/Ejemplo.sc

# 3. Las 7 integrales
scala Investigacion/src/Integrales.sc

# 4. Con errores
scala Investigacion/src/CalculoError.sc

# 5. Tests
scala Investigacion/src/Test.sc
```

---

## ⏱️ **DISTRIBUCIÓN DEL TIEMPO**

| Parte | Tiempo | Actividad |
|-------|--------|-----------|
| Introducción | 1 min | Presentar el tema |
| Simpson.sc | 1 min | Mostrar función básica |
| Ejemplo.sc | 2 min | Ejemplo paso a paso |
| Integrales.sc | 2 min | 7 integrales |
| CalculoError.sc | 2 min | Errores |
| Test.sc | 2 min | Tests |
| Conclusión | 1 min | Resumen |
| **TOTAL** | **~10 min** | |

---

## 🌟 **MENSAJE FINAL**

> "Recuerda: No se trata de memorizar el guión, sino de **entender los conceptos**. Si entiendes qué son las Higher Order Functions y cómo funciona Simpson, podrás explicarlo con tus propias palabras."

> "¡Mucha suerte en tu presentación! 🚀"

---

**Preparado por:** AI Assistant  
**Para:** Programación Funcional y Reactiva - UTPL  
**Fecha:** Semana 7

