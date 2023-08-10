package main.java.empresa.funcionarios;

import main.java.empresa.Funcionario;

public class EnsinoBasico extends Funcionario {
    private String escola;

    public EnsinoBasico(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setRendaBasica(getRendaBasica() * 1.1);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

}
