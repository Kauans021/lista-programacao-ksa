package Exemplo01;
import java.util.Scanner;
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.idade = 16;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

    }
}
