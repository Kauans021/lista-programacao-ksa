import java.util.Scanner;

public class Atividade22 {
    //Classifique um número z : exiba se é positivo, negativo ou zero.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double z = leia.nextDouble();
        if(z>0){
            System.out.println("Positivo.");
        } else if (z<0) {
            System.out.println("Negativo");
        }else
            System.out.println("Zero");

    }
}
