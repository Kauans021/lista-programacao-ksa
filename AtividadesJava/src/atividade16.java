import java.util.Scanner;
public class atividade16 {
    //RECURSSÃO

    //Função recursiva para calculo de fatorial

    int fatorial(int valor){

        if (valor == 0)
            return 1;
        else
            return valor * fatorial(valor - 1);
    }
|| 7
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Fatorial \n " +
                "Digite um valor para x:");
        int resultado = fatorial(leia.nextInt());
        System.out.println("O fatorial do número digitado é:" + resultado);

    }
}
