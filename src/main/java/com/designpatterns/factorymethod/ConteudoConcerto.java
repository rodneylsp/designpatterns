package com.designpatterns.factorymethod;

public class ConteudoConcerto extends ConteudoFactory{
    Conteudo createConteudo() {
        return new Concerto();
    }
}
