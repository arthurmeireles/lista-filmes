// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrador/Desktop/questao-2/conf/routes
// @DATE:Tue Jul 23 23:08:22 GFT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def exibirCadastrar(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cadastrar")
    }
  
    // @LINE:8
    def cadastrarFilme(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cadastrar")
    }
  
    // @LINE:15
    def remover(filme:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remover/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("filme", filme)))
    }
  
    // @LINE:13
    def listar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listar")
    }
  
    // @LINE:16
    def assistido(filme:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assistido/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("filme", filme)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
