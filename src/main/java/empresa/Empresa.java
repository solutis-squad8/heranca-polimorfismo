package main.java.empresa;

import main.java.empresa.comissoes.Gerente;
import main.java.empresa.comissoes.Supervisor;
import main.java.empresa.comissoes.Vendedor;
import main.java.empresa.funcionarios.EnsinoBasico;
import main.java.empresa.funcionarios.EnsinoMedio;
import main.java.empresa.funcionarios.Graduado;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        double salarioTotal = 0;
        double salarioBasico = 0, salarioMedio = 0, salarioSuperior = 0;

        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                funcionarios[i] = new EnsinoBasico("Leonardo " + i , "" + i);
            } else if (i < 8) {
                funcionarios[i] = new EnsinoMedio("Alisson " + i, "" + i);
            }
            else {
                funcionarios[i] = new Graduado("Victor" + i, "" + i);
            }
        }

        double custo = 0.0;
        for (Funcionario a: funcionarios) {
            custo += a.calcularRendaTotal();
            System.out.println(a);
            System.out.println("--------");
        }

        System.out.println("Custo total da empresa: " + custo);
        System.out.println("Fim exercicio 7 8 e 9");
        System.out.println();

        System.out.println("Inicio exercicio 10");
        for (int i = 0; i < 10; i++) {
            if (i < 1) {
                funcionarios[i] = new Gerente("Leonardo " + i , "" + i);
            } else if (i < 3) {
                funcionarios[i] = new Supervisor("Alisson " + i, "" + i);
            }
            else {
                funcionarios[i] = new Vendedor("Victor" + i, "" + i);
            }
        }

        custo = 0.0;
        for (Funcionario a: funcionarios) {
            custo += a.calcularRendaTotal();
            System.out.println(a);
            System.out.println("--------");
        }
        System.out.println("Custo total da empresa: R$" + custo);
    }
}
