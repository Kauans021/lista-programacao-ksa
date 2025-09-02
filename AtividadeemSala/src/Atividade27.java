import java.util.Scanner;

public class Atividade27 {
    //Entrada simples: peça nome (texto) e idade (inteiro) e exiba: “Olá , você tem anos!”.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.println("Ola,"+" " + nome + " "+"você tem" + " " + idade);
    }
}
