import java.util.Scanner;

public class Atividade11 {
    //Idade em meses: dada idadeAnos , calcule idadeMeses = idadeAnos * 12 e exiba
    //idadeMeses .
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano = 0;

        System.out.println("informe sua idade: ");
        ano = ler.nextInt();
        System.out.println("Você tem " + ( ano * 12) + " " + "meses de vida");




    }
}
