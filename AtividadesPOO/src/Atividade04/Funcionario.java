package Atividade04;

public class Funcionario {
    private String nome;
    private double SalarioBase;

    public Funcionario() {
        this.nome = nome;
        this.SalarioBase = 0;
    }

    public Funcionario(String nome, double SalarioBase) {
        this.nome = nome;
        this.SalarioBase = SalarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.SalarioBase = salarioBase;
    }

    public double getcalculoPagamento() {
        return SalarioBase;
    }

    public void setcalculoPagamento(double salarioBase) {
        this.SalarioBase = SalarioBase ;
    }

}