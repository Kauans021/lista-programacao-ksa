import java.util.Scanner;

public class Atividade35 {
    //Leia uma sequência de números inteiros até que o usuário digite -1 . Mostre o maior número digitado.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor = 0,maiorValor = 0;
         while (valor != -1) {
             System.out.println("Digite um valor: ");
             valor = leia.nextInt();

             if(valor > maiorValor) maiorValor = valor;

         }
         System.out.println("O maior valor é: " + maiorValor);
    }
}
