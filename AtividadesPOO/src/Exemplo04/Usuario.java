package Exemplo04;

public class Usuario extends Pessoa {
    private String userNome;
    private String passWod;
    public Usuario(){
        super();
    }
    public Usuario(String nome, int idade, String userNome, String passWod){
        super(idade ,nome);
        this.userNome = userNome;
        this.passWod = passWod;
    }

    //sobre escrita de metodo
    public void falar() {
        System.out.println("oi, eu sou " + this.getNome() + ". Eu tenho " + this.getIdade() + " anos de idade");
        System.out.println("Meu nome de usuario é: " + this.getNome());
    }
}
