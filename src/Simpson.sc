// Método de Simpson 1/3 para Integración Numérica

// Función de orden superior (Higher Order Function)
// Recibe: función f, límites a y b
// Retorna: valor aproximado de la integral
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val medio = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(medio) + f(b)) / 6.0
}

