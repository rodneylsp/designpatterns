package com.designpatterns.factorymethod;

public abstract class ConteudoFactory {

    abstract Conteudo createConteudo();

    void print(){
        Conteudo conteudo = createConteudo();
        conteudo.print();
    }
}
