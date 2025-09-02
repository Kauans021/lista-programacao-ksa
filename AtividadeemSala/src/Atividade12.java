import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        //Divisão inteira e resto: dados x e y , calcule quociente = x / y (inteira) e resto = x % y ;
        //exiba ambos.
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o numero a ser dividido: ");
        double x = leia.nextDouble();
        System.out.println("Informe o divisor: ");
        double y = leia.nextDouble();
        double guociente = x/y;
        double resto = x%y;
        System.out.println("Quantidade:" + Math.round(guociente)+"\n"+"Resto:"+Math.round(resto));

    }
}
