

final class Simpson$_ {
def args = Simpson_sc.args$
def scriptPath = """Simpson.sc"""
/*<script>*/
// Método de Simpson 1/3 para Integración Numérica

// Función de orden superior (Higher Order Function)
// Recibe: función f, límites a y b
// Retorna: valor aproximado de la integral
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val medio = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(medio) + f(b)) / 6.0
}


/*</script>*/ /*<generated>*//*</generated>*/
}

object Simpson_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new Simpson$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export Simpson_sc.script as `Simpson`

