package main.java.zoo.subclasses;

import main.java.zoo.superclasses.Animal;

public class Preguica extends Animal {

    public Preguica(String nome) {
        super(nome);
    }

    @Override
    public void acao() {
        System.out.println("A preguiça dormiu na árvore!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Zzzzzzz");
    }
}
