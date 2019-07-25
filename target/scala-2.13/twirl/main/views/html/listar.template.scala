
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

object listar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Filme],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(filmes : List[Filme]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Listar Filmes")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""

    """),format.raw/*5.5*/("""<h2>Lista de Filmes</h2>
    <ul>
        """),_display_(/*7.10*/for(filme <- filmes) yield /*7.30*/{_display_(Seq[Any](format.raw/*7.31*/("""
            """),format.raw/*8.13*/("""<li>"""),_display_(/*8.18*/filme/*8.23*/.getNome),_display_(/*8.32*/filme/*8.37*/.getprioridade),format.raw/*8.51*/(""" 
                """),format.raw/*9.17*/("""<a href=""""),_display_(/*9.27*/controllers/*9.38*/.routes.HomeController.remover(filmes.indexOf(filme))),format.raw/*9.91*/("""" style="margin: 0px 30px; color: white; background-color: red; text-decoration: none;"> Excluir filme </a>
            </li> 
        """)))}),format.raw/*11.10*/("""
    """),format.raw/*12.5*/("""</ul>

    <h2>Lista de filmes nao assistidos em ordem de prioridade</h2>
    <ul>
        """),_display_(/*16.10*/for(filme <- filmes) yield /*16.30*/{_display_(Seq[Any](format.raw/*16.31*/("""
            """),_display_(/*17.14*/if(filme.getprioridade == 1)/*17.42*/{_display_(Seq[Any](format.raw/*17.43*/("""
                """),_display_(/*18.18*/if(filme.getassistido == false)/*18.49*/{_display_(Seq[Any](format.raw/*18.50*/("""
                    """),format.raw/*19.21*/("""<li style="display: flex">
                        <h4 style="margin-right: 5%">"""),_display_(/*20.55*/filme/*20.60*/.getNome),format.raw/*20.68*/("""</h4> <h4>"""),_display_(/*20.79*/filme/*20.84*/.getprioridade),format.raw/*20.98*/("""</h4> 
                        <a href=""""),_display_(/*21.35*/controllers/*21.46*/.routes.HomeController.remover(filmes.indexOf(filme))),format.raw/*21.99*/("""" style="margin: 0px 30px; color: white; background-color: red; text-decoration: none;"> Excluir filme </a>
                        <a href=""""),_display_(/*22.35*/controllers/*22.46*/.routes.HomeController.assistido(filmes.indexOf(filme))),format.raw/*22.101*/("""" style="margin-right: 30px; color: white; background-color: green; text-decoration: none;">Marcar como assitido</a>
                    </li> 
                """)))}),format.raw/*24.18*/("""
            """)))}),format.raw/*25.14*/("""    
        """)))}),format.raw/*26.10*/("""      
        """),_display_(/*27.10*/for(filme <- filmes) yield /*27.30*/{_display_(Seq[Any](format.raw/*27.31*/("""
            """),_display_(/*28.14*/if(filme.getprioridade == 2)/*28.42*/{_display_(Seq[Any](format.raw/*28.43*/("""
                """),_display_(/*29.18*/if(filme.getassistido == false)/*29.49*/{_display_(Seq[Any](format.raw/*29.50*/("""
                    """),format.raw/*30.21*/("""<li style="display: flex">
                        <h4 style="margin-right: 5%">"""),_display_(/*31.55*/filme/*31.60*/.getNome),format.raw/*31.68*/("""</h4> <h4>"""),_display_(/*31.79*/filme/*31.84*/.getprioridade),format.raw/*31.98*/("""</h4> 
                        <a href=""""),_display_(/*32.35*/controllers/*32.46*/.routes.HomeController.remover(filmes.indexOf(filme))),format.raw/*32.99*/("""" style="margin: 0px 30px; color: white; background-color: red; text-decoration: none;"> Excluir filme </a>
                        <a href=""""),_display_(/*33.35*/controllers/*33.46*/.routes.HomeController.assistido(filmes.indexOf(filme))),format.raw/*33.101*/("""" style="margin-right: 30px; color: white; background-color: green; text-decoration: none;">Marcar como assitido</a>
                    </li> 
                """)))}),format.raw/*35.18*/(""" 
            """)))}),format.raw/*36.14*/("""    
        """)))}),format.raw/*37.10*/("""
        """),_display_(/*38.10*/for(filme <- filmes) yield /*38.30*/{_display_(Seq[Any](format.raw/*38.31*/("""
            """),_display_(/*39.14*/if(filme.getprioridade == 3)/*39.42*/{_display_(Seq[Any](format.raw/*39.43*/("""
                """),_display_(/*40.18*/if(filme.getassistido == false)/*40.49*/{_display_(Seq[Any](format.raw/*40.50*/("""
                    """),format.raw/*41.21*/("""<li style="display: flex">
                        <h4 style="margin-right: 5%">"""),_display_(/*42.55*/filme/*42.60*/.getNome),format.raw/*42.68*/("""</h4> <h4>"""),_display_(/*42.79*/filme/*42.84*/.getprioridade),format.raw/*42.98*/("""</h4> 
                        <a href=""""),_display_(/*43.35*/controllers/*43.46*/.routes.HomeController.remover(filmes.indexOf(filme))),format.raw/*43.99*/("""" style="margin: 0px 30px; color: white; background-color: red; text-decoration: none;"> Excluir filme </a>
                        <a href=""""),_display_(/*44.35*/controllers/*44.46*/.routes.HomeController.assistido(filmes.indexOf(filme))),format.raw/*44.101*/("""" style="margin-right: 30px; color: white; background-color: green; text-decoration: none;">Marcar como assitido</a>
                    </li> 
                """)))}),format.raw/*46.18*/(""" 
            """)))}),format.raw/*47.14*/("""    
        """)))}),format.raw/*48.10*/("""
        """),_display_(/*49.10*/for(filme <- filmes) yield /*49.30*/{_display_(Seq[Any](format.raw/*49.31*/("""
            """),_display_(/*50.14*/if(filme.getprioridade == 4)/*50.42*/{_display_(Seq[Any](format.raw/*50.43*/("""
                """),_display_(/*51.18*/if(filme.getassistido == false)/*51.49*/{_display_(Seq[Any](format.raw/*51.50*/("""
                    """),format.raw/*52.21*/("""<li style="display: flex">
                        <h4 style="margin-right: 5%">"""),_display_(/*53.55*/filme/*53.60*/.getNome),format.raw/*53.68*/("""</h4> <h4>"""),_display_(/*53.79*/filme/*53.84*/.getprioridade),format.raw/*53.98*/("""</h4> 
                        <a href=""""),_display_(/*54.35*/controllers/*54.46*/.routes.HomeController.remover(filmes.indexOf(filme))),format.raw/*54.99*/("""" style="margin: 0px 30px; color: white; background-color: red; text-decoration: none;"> Excluir filme </a>
                        <a href=""""),_display_(/*55.35*/controllers/*55.46*/.routes.HomeController.assistido(filmes.indexOf(filme))),format.raw/*55.101*/("""" style="margin-right: 30px; color: white; background-color: green; text-decoration: none;">Marcar como assitido</a>
                    </li> 
                """)))}),format.raw/*57.18*/(""" 
            """)))}),format.raw/*58.14*/("""    
        """)))}),format.raw/*59.10*/("""
        """),_display_(/*60.10*/for(filme <- filmes) yield /*60.30*/{_display_(Seq[Any](format.raw/*60.31*/("""
            """),_display_(/*61.14*/if(filme.getprioridade == 5)/*61.42*/{_display_(Seq[Any](format.raw/*61.43*/("""
                """),_display_(/*62.18*/if(filme.getassistido == false)/*62.49*/{_display_(Seq[Any](format.raw/*62.50*/("""
                    """),format.raw/*63.21*/("""<li style="display: flex">
                        <h4 style="margin-right: 5%">"""),_display_(/*64.55*/filme/*64.60*/.getNome),format.raw/*64.68*/("""</h4> <h4>"""),_display_(/*64.79*/filme/*64.84*/.getprioridade),format.raw/*64.98*/("""</h4> 
                        <a href=""""),_display_(/*65.35*/controllers/*65.46*/.routes.HomeController.remover(filmes.indexOf(filme))),format.raw/*65.99*/("""" style="margin: 0px 30px; color: white; background-color: red; text-decoration: none;"> Excluir filme </a>
                        <a href=""""),_display_(/*66.35*/controllers/*66.46*/.routes.HomeController.assistido(filmes.indexOf(filme))),format.raw/*66.101*/("""" style="margin-right: 30px; color: white; background-color: green; text-decoration: none;">Marcar como assitido</a>
                    </li> 
                """)))}),format.raw/*68.18*/(""" 
            """)))}),format.raw/*69.14*/("""    
        """)))}),format.raw/*70.10*/("""
    """),format.raw/*71.5*/("""</ul>
""")))}))
      }
    }
  }

  def render(filmes:List[Filme]): play.twirl.api.HtmlFormat.Appendable = apply(filmes)

  def f:((List[Filme]) => play.twirl.api.HtmlFormat.Appendable) = (filmes) => apply(filmes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-23T23:08:25.651
                  SOURCE: C:/Users/Administrador/Desktop/questao-2/app/views/listar.scala.html
                  HASH: ee1971621a309b2050e6331ec737ebe31789c840
                  MATRIX: 954->1|1070->24|1097->26|1126->47|1164->48|1196->54|1265->97|1300->117|1338->118|1378->131|1409->136|1422->141|1450->150|1463->155|1497->169|1542->187|1578->197|1597->208|1670->261|1837->397|1869->402|1988->494|2024->514|2063->515|2104->529|2141->557|2180->558|2225->576|2265->607|2304->608|2353->629|2461->710|2475->715|2504->723|2542->734|2556->739|2591->753|2659->794|2679->805|2753->858|2922->1000|2942->1011|3019->1066|3211->1227|3256->1241|3301->1255|3344->1271|3380->1291|3419->1292|3460->1306|3497->1334|3536->1335|3581->1353|3621->1384|3660->1385|3709->1406|3817->1487|3831->1492|3860->1500|3898->1511|3912->1516|3947->1530|4015->1571|4035->1582|4109->1635|4278->1777|4298->1788|4375->1843|4567->2004|4613->2019|4658->2033|4695->2043|4731->2063|4770->2064|4811->2078|4848->2106|4887->2107|4932->2125|4972->2156|5011->2157|5060->2178|5168->2259|5182->2264|5211->2272|5249->2283|5263->2288|5298->2302|5366->2343|5386->2354|5460->2407|5629->2549|5649->2560|5726->2615|5918->2776|5964->2791|6009->2805|6046->2815|6082->2835|6121->2836|6162->2850|6199->2878|6238->2879|6283->2897|6323->2928|6362->2929|6411->2950|6519->3031|6533->3036|6562->3044|6600->3055|6614->3060|6649->3074|6717->3115|6737->3126|6811->3179|6980->3321|7000->3332|7077->3387|7269->3548|7315->3563|7360->3577|7397->3587|7433->3607|7472->3608|7513->3622|7550->3650|7589->3651|7634->3669|7674->3700|7713->3701|7762->3722|7870->3803|7884->3808|7913->3816|7951->3827|7965->3832|8000->3846|8068->3887|8088->3898|8162->3951|8331->4093|8351->4104|8428->4159|8620->4320|8666->4335|8711->4349|8743->4354
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|42->11|43->12|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|66->35|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|73->42|73->42|73->42|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|77->46|78->47|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|88->57|89->58|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|99->68|100->69|101->70|102->71
                  -- GENERATED --
              */
          