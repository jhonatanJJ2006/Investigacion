// Ejemplo paso a paso del Método de Simpson 1/3

// Función principal de integración
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val medio = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(medio) + f(b)) / 6.0
}

println("EJEMPLO: Integral ∫[3,5] (-x² + 8x - 12) dx")
println()

val a = 3.0
val b = 5.0
val f = (x: Double) => -x*x + 8*x - 12

println(s"Límites: a = $a, b = $b")
println(s"Función: f(x) = -x² + 8x - 12")
println()

val medio = (a + b) / 2.0
println(s"Paso 1: Punto medio = ($a + $b) / 2 = $medio")
println()

println(s"Paso 2: Evaluar función")
val fa = f(a)
val fm = f(medio)
val fb = f(b)
println(s"  f($a) = $fa")
println(s"  f($medio) = $fm")
println(s"  f($b) = $fb")
println()

println(s"Paso 3: Aplicar fórmula")
println(s"  Integral = (b-a) × [f(a) + 4×f(medio) + f(b)] / 6")
println(s"  Integral = ${b-a} × [$fa + 4×$fm + $fb] / 6")

val resultado = integracion(a, b, f)
println(s"  Integral = $resultado")
println()

println(s"Valor esperado: 7.33")
println(s"Error: ${math.abs(7.33 - resultado)}")

