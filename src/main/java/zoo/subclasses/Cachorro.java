package main.java.zoo.subclasses;

import main.java.zoo.superclasses.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void acao() {
        System.out.println("O cachorro correu!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
