package main.java.empresa.funcionarios;

public class Graduado extends EnsinoMedio {
    private String universidade;

    public Graduado(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setRendaBasica(getRendaBasica() * 2);
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

}