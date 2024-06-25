package com.designpatterns.factorymethod;

public class ConteudoFilme extends ConteudoFactory{
    Conteudo createConteudo() {
        return new Filme();
    }
}
