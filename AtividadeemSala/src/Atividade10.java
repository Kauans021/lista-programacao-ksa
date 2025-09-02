import java.util.Scanner;
public class Atividade10 {
    //Converta temperatura: dada celsius , calcule fahrenheit = (9 * celsius) / 5 + 32 e
    //exiba fahrenheit .
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;
        System.out.println("Digite a temperatura em celsius: ");
        celsius = ler.nextInt();
        System.out.println("Resultado em fahrenheit: " + ((9 * celsius)  / 5 + 32));


    }

}
