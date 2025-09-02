import java.util.Scanner;

public class Atividade30 {
    //Leia uma letra ( A , B , C , D ) e mostre uma mensagem diferente para cada opção. Se não for nenhuma
    //dessas, mostre “Opção inválida”.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char opcao;
        do {
            System.out.println("Escolha uma ledra das opçoes abaixo: ");
            System.out.println(
                    "A \n" +
                            "B \n" +
                            "C \n" +
                            "D \n"


            );
            opcao = leia.next().toLowerCase().charAt(0);
            switch (opcao) {
                case 'a':
                    System.out.println("Você escolheu a letra A");
                    break;
                case 'B':
                    System.out.println("Você escolheu a letra B");
                    break;
                case 'C':
                    System.out.println("Você escolheu a letra C");
                    break;
                case 'D':
                    System.out.println("Você escolheu a letra D");

                    break;

            }
        }while (opcao != 'x');

    }
}


