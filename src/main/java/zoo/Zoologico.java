package main.java.zoo;

import main.java.zoo.subclasses.Cachorro;
import main.java.zoo.subclasses.Cavalo;
import main.java.zoo.subclasses.Preguica;
import main.java.zoo.superclasses.Animal;

import java.util.Scanner;

public class Zoologico {
    Scanner scanner = new Scanner(System.in);
    private Animal[] jaula = new Animal[10];

    public Zoologico() {
        String string;
        for (int i = 0; i < 10; i++) {
            System.out.print("Qual o animal (Cachorro / Cavalo / Preguica): ");
            string = scanner.next().toLowerCase();
            switch (string) {
                case "cachorro":
                    Animal cachorro = new Cachorro("Cachorro " + (i + 1));
                    jaula[i] = cachorro;
                    break;
                case "cavalo":
                    Animal cavalo = new Cavalo("Cavalo " + (i + 1));
                    jaula[i] = cavalo;
                    break;
                case "preguica":
                    Animal preguica = new Preguica("Preguica " + (i + 1));
                    jaula[i] = preguica;
                    break;
            }
        }
    }

    public Animal[] getJaula() {
        return jaula;
    }
}
