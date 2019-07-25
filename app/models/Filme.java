package models;
import java.util.*;

public class Filme{

    private String nome;
    private String genero;
    private int prioridade;
    private int ano;
    private boolean assistido = false;

    public Filme(String nome, String genero, int prioridade, int ano, boolean assistido){
        this.nome = nome;
        this.genero = genero;
        this.prioridade = prioridade;
        this.ano = ano;
        this.assistido = assistido;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
     
    public String getgenero(){
        return genero;
    }

    public void setgenero(String genero){
        this.genero = genero;
    }

    public int getprioridade(){
        return prioridade;
    }

    public void setprioridade(int prioridade){
        this.prioridade = prioridade;
    }

    public int getano(){
        return ano;
    }

    public void setano(int ano){
        this.ano = ano;
    }

    public boolean getassistido(){
        return assistido;
    }

    public void setassistido(boolean assistido){
        this.assistido = assistido;
    }
}