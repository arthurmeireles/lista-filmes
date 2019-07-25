// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrador/Desktop/questao-2/conf/routes
// @DATE:Tue Jul 23 23:08:22 GFT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:20
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:20
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar""", """controllers.HomeController.cadastrarFilme"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastrar""", """controllers.HomeController.exibirCadastrar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listar""", """controllers.HomeController.listar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remover/""" + "$" + """filme<[^/]+>""", """controllers.HomeController.remover(filme:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assistido/""" + "$" + """filme<[^/]+>""", """controllers.HomeController.assistido(filme:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_cadastrarFilme1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar")))
  )
  private[this] lazy val controllers_HomeController_cadastrarFilme1_invoker = createInvoker(
    HomeController_1.cadastrarFilme,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cadastrarFilme",
      Nil,
      "GET",
      this.prefix + """cadastrar""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_exibirCadastrar2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastrar")))
  )
  private[this] lazy val controllers_HomeController_exibirCadastrar2_invoker = createInvoker(
    HomeController_1.exibirCadastrar,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "exibirCadastrar",
      Nil,
      "POST",
      this.prefix + """cadastrar""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_listar3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listar")))
  )
  private[this] lazy val controllers_HomeController_listar3_invoker = createInvoker(
    HomeController_1.listar,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listar",
      Nil,
      "GET",
      this.prefix + """listar""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_remover4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remover/"), DynamicPart("filme", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_remover4_invoker = createInvoker(
    HomeController_1.remover(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "remover",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """remover/""" + "$" + """filme<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_assistido5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assistido/"), DynamicPart("filme", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_assistido5_invoker = createInvoker(
    HomeController_1.assistido(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "assistido",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """assistido/""" + "$" + """filme<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_HomeController_cadastrarFilme1_route(params@_) =>
      call { 
        controllers_HomeController_cadastrarFilme1_invoker.call(HomeController_1.cadastrarFilme)
      }
  
    // @LINE:11
    case controllers_HomeController_exibirCadastrar2_route(params@_) =>
      call { 
        controllers_HomeController_exibirCadastrar2_invoker.call(HomeController_1.exibirCadastrar)
      }
  
    // @LINE:13
    case controllers_HomeController_listar3_route(params@_) =>
      call { 
        controllers_HomeController_listar3_invoker.call(HomeController_1.listar)
      }
  
    // @LINE:15
    case controllers_HomeController_remover4_route(params@_) =>
      call(params.fromPath[Int]("filme", None)) { (filme) =>
        controllers_HomeController_remover4_invoker.call(HomeController_1.remover(filme))
      }
  
    // @LINE:16
    case controllers_HomeController_assistido5_route(params@_) =>
      call(params.fromPath[Int]("filme", None)) { (filme) =>
        controllers_HomeController_assistido5_invoker.call(HomeController_1.assistido(filme))
      }
  
    // @LINE:20
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
