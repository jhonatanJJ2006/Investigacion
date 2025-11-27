// Tests de Verificación para el Método de Simpson

// Función de integración
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val medio = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(medio) + f(b)) / 6.0
}

// Función para verificar un test
def verificarTest(nombre: String, obtenido: Double, esperado: Double): Boolean = {
  val error = math.abs(obtenido - esperado)
  val paso = error < 0.01
  
  if (paso) {
    println(s"✓ $nombre")
  } else {
    println(s"✗ $nombre")
  }
  println(s"  Esperado: $esperado, Obtenido: $obtenido, Error: $error")
  println()
  
  paso
}

println("TESTS DE VERIFICACIÓN")
println()

// Definir funciones
val f1 = (x: Double) => -x*x + 8*x - 12
val f2 = (x: Double) => 3*x*x
val f3 = (x: Double) => x + 2*x*x - x*x*x + 5*x*x*x*x
val f4 = (x: Double) => (2*x + 1) / (x*x + x)
val f5 = (x: Double) => math.exp(x)
val f6 = (x: Double) => 1.0 / math.sqrt(x - 1)
val f7 = (x: Double) => 1.0 / (1 + x*x)

// Ejecutar tests
val resultados = List(
  verificarTest("Test 1: -x² + 8x - 12", integracion(3, 5, f1), 7.33),
  verificarTest("Test 2: 3x²", integracion(0, 2, f2), 8.0),
  verificarTest("Test 3: Polinomio grado 4", integracion(-1, 1, f3), 3.333),
  verificarTest("Test 4: Función racional", integracion(1, 2, f4), 1.09861),
  verificarTest("Test 5: e^x", integracion(0, 1, f5), 1.71828),
  verificarTest("Test 6: 1/√(x-1)", integracion(2, 3, f6), 0.828427),
  verificarTest("Test 7: 1/(1+x²)", integracion(0, 1, f7), 0.785398)
)

// Contar resultados (forma funcional)
val pasados = resultados.count(_ == true)
val totales = resultados.length

println("=" * 50)
println(s"RESUMEN: $pasados/$totales tests pasaron")
if (pasados == totales) {
  println("¡TODOS LOS TESTS PASARON!")
} else {
  println(s"${totales - pasados} test(s) fallaron")
}
println("=" * 50)

