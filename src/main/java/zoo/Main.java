package main.java.zoo;

import main.java.zoo.subclasses.Cachorro;
import main.java.zoo.subclasses.Cavalo;
import main.java.zoo.subclasses.Preguica;
import main.java.zoo.superclasses.Animal;

public class Main {
    public static void main(String[] args) {
        Animal cachorro1 = new Cachorro("Cachorro");
        Animal cavalo1 = new Cavalo("Cavalo");
        Animal preguica1 = new Preguica("Preguica");

        cachorro1.emitirSom();
        cavalo1.emitirSom();
        preguica1.emitirSom();
        System.out.println("FIM!");
        System.out.println();

        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro1);
        veterinario.examinar(cavalo1);
        veterinario.examinar(preguica1);
        System.out.println("Fim");
        System.out.println();

        Zoologico zoologico = new Zoologico();

        for (Animal a : zoologico.getJaula()) {
            System.out.println("O animal " + a.getNome() + " emitiu o som: ");
            a.emitirSom();
            a.acao();
            System.out.println();
        }
    }
}