import java.util.Scanner;

public class Atividade41 {
    //41. Leia 5 números inteiros e armazene em um vetor. Ao final, mostre todos os números digitados.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numero = new int[5];

       System.out.println("Insira o numero");

       for(int i = 0; i< numero.length; i++){
           System.out.println("Digite o " + (i+1) + "° numero:");
           numero[i] = leia.nextInt();
       }
       System.out.println("O numer é:");
        for(int i = 0; i< numero.length; i++) {
            System.out.println(numero[i]);
        }



    }
}
