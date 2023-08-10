package main.java.empresa.comissoes;

import main.java.empresa.Funcionario;
import main.java.empresa.funcionarios.EnsinoBasico;
import main.java.empresa.funcionarios.EnsinoMedio;

public class Supervisor extends EnsinoMedio {


    public Supervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setComissao(600.0);
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() + getComissao();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nRenda Total: R$" + calcularRendaTotal() + "\nComissão: " + getComissao();
    }
}
