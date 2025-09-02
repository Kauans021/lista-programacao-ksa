import java.util.Scanner;
public class Atividade25 {
    //Salário: dado salario , exiba “Você paga imposto” se salario > 3000 ; senão, exiba “Isento”.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = leia.nextDouble();
        if(salario <= 3000) {
            System.out.println("Não paga imposto");
        } else System.out.println("Paga imposto");
    }
}
