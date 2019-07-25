// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrador/Desktop/questao-2/conf/routes
// @DATE:Tue Jul 23 23:08:22 GFT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
