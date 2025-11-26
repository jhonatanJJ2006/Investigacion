// Cálculo de errores entre valores esperados y obtenidos

import scala.math._

// Función de integración (Método de Simpson 1/3)
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val xBarra = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(xBarra) + f(b)) / 6.0
}

/**
 * Calcula el error absoluto entre el valor esperado y el obtenido
 * @param esperado: valor esperado de la integral
 * @param obtenido: valor calculado con el método de Simpson
 * @return error absoluto
 */
def calcularError(esperado: Double, obtenido: Double): Double = {
  abs(esperado - obtenido)
}

// Definición de funciones
val f1 = (x: Double) => -pow(x, 2) + 8*x - 12
val f2 = (x: Double) => 3 * pow(x, 2)
val f3 = (x: Double) => x + 2*pow(x, 2) - pow(x, 3) + 5*pow(x, 4)
val f4 = (x: Double) => (2*x + 1) / (pow(x, 2) + x)
val f5 = (x: Double) => exp(x)
val f6 = (x: Double) => 1 / sqrt(x - 1)
val f7 = (x: Double) => 1 / (1 + pow(x, 2))

// Cálculo de integrales
val integrales = List(
  (integracion(3, 5, f1), 7.33, "Integral 1"),
  (integracion(0, 2, f2), 8.0, "Integral 2"),
  (integracion(-1, 1, f3), 3.333, "Integral 3"),
  (integracion(1, 2, f4), 1.09861, "Integral 4"),
  (integracion(0, 1, f5), 1.71828, "Integral 5"),
  (integracion(2, 3, f6), 0.828427, "Integral 6"),
  (integracion(0, 1, f7), 0.785398, "Integral 7")
)

// Mostrar resultados con errores
println("=" * 70)
println("CÁLCULO DE ERRORES")
println("=" * 70)
integrales.foreach { case (obtenido, esperado, nombre) =>
  val error = calcularError(esperado, obtenido)
  println(f"$nombre%-12s | Esperado: $esperado%.6f | Obtenido: $obtenido%.6f | Error: $error%.6f")
}
println("=" * 70)

