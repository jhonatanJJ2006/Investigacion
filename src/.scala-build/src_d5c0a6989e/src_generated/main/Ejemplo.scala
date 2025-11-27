

final class Ejemplo$_ {
def args = Ejemplo_sc.args$
def scriptPath = """Ejemplo.sc"""
/*<script>*/
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


/*</script>*/ /*<generated>*//*</generated>*/
}

object Ejemplo_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new Ejemplo$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export Ejemplo_sc.script as `Ejemplo`

