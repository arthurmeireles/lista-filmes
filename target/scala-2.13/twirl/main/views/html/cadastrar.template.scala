
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object cadastrar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Cadastrar Livro")/*2.25*/{_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<form action=""""),_display_(/*3.20*/controllers/*3.31*/.routes.HomeController.exibirCadastrar()),format.raw/*3.71*/("""" method="post">
        <label for="Titulo">Nome do filme</label>
        <input type="text" name="nome" placeholder="Digite o nome do Livro">
        <br>
        <label for="generos">Generos</label>
        <select name="generos">
            <option value="comedia" name="comedia">Comedia</option> 
            <option value="drama" name="drama">Drama</option>
            <option value="romance" name="romance">Romance</option> 
            <option value="outro" name="outro">Outro</option>
        </select>
        <br>
        <label for="prioridades">Prioridade</label>
        <select name="prioridades">
            <option value="1" name="1">1</option> 
            <option value="2" name="2">2</option>
            <option value="3" name="3">3</option> 
            <option value="4" name="4">4</option>
            <option value="5" name="5">5</option>
        </select>
        <br>
        <label for="ano">Ano de Produção</label>
        <input type="text" name="ano" placeholder="Digite o ano de produção">
        <br>
        <label for="assistido">assistido</label>
        <select name="assistido">
            <option value="SIM" name="SIM">SIM</option> 
            <option value="NAO" name="NAO">NAO</option>
        </select>
        <br>
        <button type="submit">Enviar</button>
    </form>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-23T23:08:25.181
                  SOURCE: C:/Users/Administrador/Desktop/questao-2/app/views/cadastrar.scala.html
                  HASH: ddb7caf90cc144ba71e840e0c5c4ea864efe37a2
                  MATRIX: 945->1|1041->5|1072->28|1110->29|1141->34|1182->49|1201->60|1261->100
                  LINES: 28->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3
                  -- GENERATED --
              */
          