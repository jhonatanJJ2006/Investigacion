// Implementación del Método de Simpson 1/3 para Integración Numérica

/**
 * Función de orden superior que calcula la integral definida usando Simpson 1/3
 * @param a: límite inferior de integración
 * @param b: límite superior de integración  
 * @param f: función a integrar (higher order function)
 * @return valor aproximado de la integral
 */
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val xBarra = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(xBarra) + f(b)) / 6.0
}

