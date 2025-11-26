// Aplicación del método de Simpson a las 7 integrales del trabajo

import scala.math._

// Función de integración (Método de Simpson 1/3)
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val xBarra = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(xBarra) + f(b)) / 6.0
}

// Integral 1: ∫[3,5] (-x² + 8x - 12) dx ≅ 7.33
val f1 = (x: Double) => -pow(x, 2) + 8*x - 12
val integral1 = integracion(3, 5, f1)
println(f"Integral 1: $integral1%.5f (esperado: 7.33)")

// Integral 2: ∫[0,2] 3x² dx ≅ 8
val f2 = (x: Double) => 3 * pow(x, 2)
val integral2 = integracion(0, 2, f2)
println(f"Integral 2: $integral2%.5f (esperado: 8.0)")

// Integral 3: ∫[-1,1] (x + 2x² - x³ + 5x⁴) dx ≅ 3.333
val f3 = (x: Double) => x + 2*pow(x, 2) - pow(x, 3) + 5*pow(x, 4)
val integral3 = integracion(-1, 1, f3)
println(f"Integral 3: $integral3%.5f (esperado: 3.333)")

// Integral 4: ∫[1,2] (2x + 1)/(x² + x) dx ≅ 1.09861
val f4 = (x: Double) => (2*x + 1) / (pow(x, 2) + x)
val integral4 = integracion(1, 2, f4)
println(f"Integral 4: $integral4%.5f (esperado: 1.09861)")

// Integral 5: ∫[0,1] e^x dx ≅ 1.71828
val f5 = (x: Double) => exp(x)
val integral5 = integracion(0, 1, f5)
println(f"Integral 5: $integral5%.5f (esperado: 1.71828)")

// Integral 6: ∫[2,3] 1/√(x-1) dx ≅ 0.828427
val f6 = (x: Double) => 1 / sqrt(x - 1)
val integral6 = integracion(2, 3, f6)
println(f"Integral 6: $integral6%.5f (esperado: 0.828427)")

// Integral 7: ∫[0,1] 1/(1+x²) dx ≅ 0.785398
val f7 = (x: Double) => 1 / (1 + pow(x, 2))
val integral7 = integracion(0, 1, f7)
println(f"Integral 7: $integral7%.5f (esperado: 0.785398)")

