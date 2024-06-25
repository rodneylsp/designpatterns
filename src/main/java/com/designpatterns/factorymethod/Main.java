package com.designpatterns.factorymethod;

public class Main {

    protected static ConteudoFactory conteudoFactory;

    static void inicializar(String conteudo) throws Exception {
        //a fonte poderia ser um database ou arquivo de configuração

        if(conteudo.equals("filme")){
            conteudoFactory = new ConteudoFilme();
        }else if(conteudo.equals("concerto")){
            conteudoFactory = new ConteudoConcerto();
        }else{
            throw new Exception("Erro! conteudo desconhecido");
        }
    }

    public static void main(String[] args) throws Exception {
        inicializar("filme");
        conteudoFactory.print();
    }
}
