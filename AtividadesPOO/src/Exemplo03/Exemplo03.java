package Exemplo03;
import java.util.Scanner;
public class Exemplo03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //
        Pessoa pessoa = new Pessoa(22,"Kauan");
        pessoa.falar();
        //
        pessoa.setIdade(21);
        //
        System.out.println("Correção, minha idade é" + pessoa.getIdade());
        String nomeAnterior = pessoa.getNome();
        pessoa.setNome("saohadbol");
        System.out.println("nome anterior: " + nomeAnterior);
        System.out.println("Nome novo: " + pessoa.getNome());
        pessoa.falar();

    }
}
