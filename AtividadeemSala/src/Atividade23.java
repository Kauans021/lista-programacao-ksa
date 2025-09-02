import java.util.Scanner;
public class Atividade23 {
    //Paridade: dado um inteiro k , exiba “Par” se k % 2 == 0 ; senão, “Ímpar”.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double k = leia.nextDouble();

        if(k % 2 == 0){
            System.out.println("È Par.");

        }else System.out.println("È Impar");

    }
}
