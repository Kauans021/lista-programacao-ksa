import java.util.Scanner;
public class Atividade24 {
    //Leia um número e exiba “Quadrado calculado” se numero * numero > 100 ; caso contrário, exiba
    //“Quadrado pequeno ou igual a 100”.

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = leia.nextDouble();
        if (num * num > 100) {
            System.out.println("Quadrado calculado");
        } else if(num * num < 100)
            System.out.println("Quadrado pequeno");
    }

}
