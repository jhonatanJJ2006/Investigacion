

final class Simpson$_ {
def args = Simpson_sc.args$
def scriptPath = """Simpson.sc"""
/*<script>*/
// Implementación del Método de Simpson 1/3 para Integración Numérica

/**
 * Función de orden superior que calcula la integral definida usando Simpson 1/3
 * @param a: límite inferior de integración
 * @param b: límite superior de integración  
 * @param f: función a integrar (higher order function)
 * @return valor aproximado de la integral
 */
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val xBarra = (a + b) / 2.0
  (b - a) * (f(a) + 4 * f(xBarra) + f(b)) / 6.0
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

