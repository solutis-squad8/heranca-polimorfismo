package main.java.empresa.comissoes;

import main.java.empresa.funcionarios.EnsinoBasico;

public class Vendedor extends EnsinoBasico {

    public Vendedor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setComissao(250.0);
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
