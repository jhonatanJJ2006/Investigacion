// Ejemplo Interactivo del Método de Simpson 1/3

import scala.math._

// Función de integración (Método de Simpson 1/3)
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val xBarra = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(xBarra) + f(b)) / 6.0
}

println("=" * 70)
println("  EJEMPLO DETALLADO: Método de Simpson 1/3")
println("=" * 70)
println()

// Ejemplo 1: Integral paso a paso
println("Ejemplo 1: ∫[3,5] (-x² + 8x - 12) dx")
println("-" * 70)

val a = 3.0
val b = 5.0
val f = (x: Double) => -pow(x, 2) + 8*x - 12

println(s"Límite inferior (a): $a")
println(s"Límite superior (b): $b")
println(s"Función: f(x) = -x² + 8x - 12")
println()

val xBarra = (a + b) / 2.0
println(s"Paso 1: Calcular punto medio")
println(s"  x̄ = (a + b) / 2 = ($a + $b) / 2 = $xBarra")
println()

println(s"Paso 2: Evaluar función en tres puntos")
val fa = f(a)
val fx = f(xBarra)
val fb = f(b)
println(s"  f($a) = $fa")
println(s"  f($xBarra) = $fx")
println(s"  f($b) = $fb")
println()

println(s"Paso 3: Aplicar fórmula de Simpson")
println(s"  I ≅ (b-a) × [f(a) + 4f(x̄) + f(b)] / 6")
println(s"  I ≅ (${b-a}) × [$fa + 4×$fx + $fb] / 6")
println(s"  I ≅ (${b-a}) × [${fa + 4*fx + fb}] / 6")

val resultado = integracion(a, b, f)
println(s"  I ≅ $resultado")
println()

println(s"Valor esperado: 7.33")
println(s"Error absoluto: ${abs(7.33 - resultado)}")
println()
println("=" * 70)

