import java.util.Scanner;

public class Atividade42 {
    public static void main(String[] args) {
        //Leia 10 números inteiros em um vetor e exiba somente os pares.
        Scanner leia = new Scanner(System.in);
        int[] numero = new int[10];

        System.out.println("Insira o numero abaixo");

        for(int i = 0; i< numero.length; i++){
            System.out.println("Digite o " + (i+1) + "° numero:");
            numero[i] = leia.nextInt();
        }
        System.out.println("Os numeros pares são:");
        for(int i = 0; i< numero.length; i++) {
            if(numero[i] % 2 == 0) {
                System.out.println(numero[i]);
            }
        }
    }
}