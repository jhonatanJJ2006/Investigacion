// Las 7 integrales del trabajo con Método de Simpson 1/3

// Función de integración
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val medio = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(medio) + f(b)) / 6.0
}

println("CÁLCULO DE LAS 7 INTEGRALES")
println()

// Integral 1: ∫[3,5] (-x² + 8x - 12) dx
val f1 = (x: Double) => -x*x + 8*x - 12
println(s"1. Integral = ${integracion(3, 5, f1)} (esperado: 7.33)")

// Integral 2: ∫[0,2] 3x² dx
val f2 = (x: Double) => 3*x*x
println(s"2. Integral = ${integracion(0, 2, f2)} (esperado: 8.0)")

// Integral 3: ∫[-1,1] (x + 2x² - x³ + 5x⁴) dx
val f3 = (x: Double) => x + 2*x*x - x*x*x + 5*x*x*x*x
println(s"3. Integral = ${integracion(-1, 1, f3)} (esperado: 3.333)")

// Integral 4: ∫[1,2] (2x+1)/(x²+x) dx
val f4 = (x: Double) => (2*x + 1) / (x*x + x)
println(s"4. Integral = ${integracion(1, 2, f4)} (esperado: 1.09861)")

// Integral 5: ∫[0,1] e^x dx
val f5 = (x: Double) => math.exp(x)
println(s"5. Integral = ${integracion(0, 1, f5)} (esperado: 1.71828)")

// Integral 6: ∫[2,3] 1/√(x-1) dx
val f6 = (x: Double) => 1.0 / math.sqrt(x - 1)
println(s"6. Integral = ${integracion(2, 3, f6)} (esperado: 0.828427)")

// Integral 7: ∫[0,1] 1/(1+x²) dx
val f7 = (x: Double) => 1.0 / (1 + x*x)
println(s"7. Integral = ${integracion(0, 1, f7)} (esperado: 0.785398)")

