// Tests de Verificación para el Método de Simpson

import scala.math._

// Función de integración (Método de Simpson 1/3)
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val xBarra = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(xBarra) + f(b)) / 6.0
}

println("=" * 70)
println("  TESTS DE VERIFICACIÓN")
println("=" * 70)
println()

var testsPasados = 0
var testsTotales = 0

def test(nombre: String, obtenido: Double, esperado: Double, tolerancia: Double = 0.01): Unit = {
  testsTotales += 1
  val diferencia = abs(obtenido - esperado)
  if (diferencia <= tolerancia) {
    println(s"✅ PASS: $nombre")
    println(s"   Esperado: $esperado, Obtenido: $obtenido, Diferencia: $diferencia")
    testsPasados += 1
  } else {
    println(s"❌ FAIL: $nombre")
    println(s"   Esperado: $esperado, Obtenido: $obtenido, Diferencia: $diferencia")
  }
  println()
}

// Test 1: Polinomio de grado 2
val f1 = (x: Double) => -pow(x, 2) + 8*x - 12
test("Integral 1: Polinomio grado 2", integracion(3, 5, f1), 7.33, 0.01)

// Test 2: Polinomio simple
val f2 = (x: Double) => 3 * pow(x, 2)
test("Integral 2: 3x²", integracion(0, 2, f2), 8.0, 0.01)

// Test 3: Polinomio grado 4
val f3 = (x: Double) => x + 2*pow(x, 2) - pow(x, 3) + 5*pow(x, 4)
test("Integral 3: Polinomio grado 4", integracion(-1, 1, f3), 3.333, 0.01)

// Test 4: Función racional
val f4 = (x: Double) => (2*x + 1) / (pow(x, 2) + x)
test("Integral 4: Racional", integracion(1, 2, f4), 1.09861, 0.01)

// Test 5: Exponencial
val f5 = (x: Double) => exp(x)
test("Integral 5: e^x", integracion(0, 1, f5), 1.71828, 0.01)

// Test 6: Raíz
val f6 = (x: Double) => 1 / sqrt(x - 1)
test("Integral 6: 1/√(x-1)", integracion(2, 3, f6), 0.828427, 0.01)

// Test 7: Función trigonométrica relacionada
val f7 = (x: Double) => 1 / (1 + pow(x, 2))
test("Integral 7: 1/(1+x²)", integracion(0, 1, f7), 0.785398, 0.01)

// Resumen
println("=" * 70)
println(s"  RESUMEN: $testsPasados/$testsTotales tests pasados")
if (testsPasados == testsTotales) {
  println("  🎉 ¡TODOS LOS TESTS PASARON!")
} else {
  println(s"  ⚠️  ${testsTotales - testsPasados} test(s) fallaron")
}
println("=" * 70)

