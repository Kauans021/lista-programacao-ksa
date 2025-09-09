package Exemplo03;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = "";
        this.idade = 0;

    }
    public Pessoa(int idade, String nome){
        this.nome = nome;
        this.idade = idade;

    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int valor) {
        this.idade = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void falar() {
        System.out.println("oi, eu sou " + this.nome + ". Eu tenho " + this.idade + " anos de idade");}

}
