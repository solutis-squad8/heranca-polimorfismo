package main.java.zoo.subclasses;

import main.java.zoo.superclasses.Animal;

public class Cavalo extends Animal {

    public Cavalo(String nome) {
        super(nome);
    }

    @Override
    public void acao() {
        System.out.println("O cavalo galopou!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Relincho");
    }
}
