package main.java.empresa;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private Double rendaBasica = 1000.0;
    private Double comissao;


    public Funcionario() {
    }

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        return rendaBasica;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nRenda Total: R$" + calcularRendaTotal();
    }
}
