package controllers;
import java.util.Collections;
import play.mvc.*;
import models.*;
import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    List<Filme> filmes = new ArrayList<>();
    // List<Filme> filmesNaoAssistidos = new ArrayList<>();



    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result cadastrarFilme(){
        return ok(views.html.cadastrar.render());
    }

    public Result listar(){
        return ok(views.html.listar.render(filmes));
    }


    public Result exibirCadastrar(){
        Map<String, String[]> r = request().body().asFormUrlEncoded();
        String nome = r.get("nome")[0];
        String genero = r.get("generos")[0];
        int prioridade = Integer.parseInt(r.get("prioridades")[0]);
        int ano = Integer.parseInt(r.get("ano")[0]);
        String assistido = r.get("assistido")[0];
        
        boolean assistido_b;

        if(assistido.equals("SIM")){
            assistido_b = true;
        }else{
            assistido_b = false;
        }

        Filme filme1 = new Filme(nome, genero, prioridade, ano, assistido_b);
        filmes.add(filme1);

     
        return redirect("/listar");
    }

    public Result remover(int filme){
        filmes.remove(filme);
        return redirect("/listar");
    }

     public Result assistido(int filmePos){
        Filme filmeObj =  filmes.get(filmePos);
        filmeObj.setassistido(true);
        return redirect("/listar");
    }

}
