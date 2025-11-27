

final class CalculoError$_ {
def args = CalculoError_sc.args$
def scriptPath = """CalculoError.sc"""
/*<script>*/
// Método de Simpson 1/3 - Versión Simple

// Función principal: recibe función f, límites a y b
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val medio = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(medio) + f(b)) / 6.0
}

// Calcula el error
def calcularError(esperado: Double, obtenido: Double): Double = {
  math.abs(esperado - obtenido)
}

// Las 7 funciones a integrar
val f1 = (x: Double) => -x*x + 8*x - 12
val f2 = (x: Double) => 3*x*x
val f3 = (x: Double) => x + 2*x*x - x*x*x + 5*x*x*x*x
val f4 = (x: Double) => (2*x + 1) / (x*x + x)
val f5 = (x: Double) => math.exp(x)
val f6 = (x: Double) => 1.0 / math.sqrt(x - 1)
val f7 = (x: Double) => 1.0 / (1 + x*x)

// Calcular las 7 integrales
println("RESULTADOS:")
println()

val r1 = integracion(3, 5, f1)
println(s"1. Integral = $r1, Esperado = 7.33, Error = ${calcularError(7.33, r1)}")

val r2 = integracion(0, 2, f2)
println(s"2. Integral = $r2, Esperado = 8.0, Error = ${calcularError(8.0, r2)}")

val r3 = integracion(-1, 1, f3)
println(s"3. Integral = $r3, Esperado = 3.333, Error = ${calcularError(3.333, r3)}")

val r4 = integracion(1, 2, f4)
println(s"4. Integral = $r4, Esperado = 1.09861, Error = ${calcularError(1.09861, r4)}")

val r5 = integracion(0, 1, f5)
println(s"5. Integral = $r5, Esperado = 1.71828, Error = ${calcularError(1.71828, r5)}")

val r6 = integracion(2, 3, f6)
println(s"6. Integral = $r6, Esperado = 0.828427, Error = ${calcularError(0.828427, r6)}")

val r7 = integracion(0, 1, f7)
println(s"7. Integral = $r7, Esperado = 0.785398, Error = ${calcularError(0.785398, r7)}")


/*</script>*/ /*<generated>*//*</generated>*/
}

object CalculoError_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new CalculoError$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export CalculoError_sc.script as `CalculoError`

