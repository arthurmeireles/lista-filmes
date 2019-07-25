// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrador/Desktop/questao-2/conf/routes
// @DATE:Tue Jul 23 23:08:22 GFT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def exibirCadastrar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.exibirCadastrar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar"})
        }
      """
    )
  
    // @LINE:8
    def cadastrarFilme: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.cadastrarFilme",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar"})
        }
      """
    )
  
    // @LINE:15
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.remover",
      """
        function(filme0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remover/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("filme", filme0))})
        }
      """
    )
  
    // @LINE:13
    def listar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listar"})
        }
      """
    )
  
    // @LINE:16
    def assistido: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.assistido",
      """
        function(filme0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assistido/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("filme", filme0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
