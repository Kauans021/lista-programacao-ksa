import java.util.Scanner;

public class Atividade9 {
    //Loop
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        //faça / equanto condiçao  (dp/while

        System.out.println("Digite um numero inteiro de 0 a 10: ");
        int numero = leia.nextInt();
        do{
            numero++;
                    System.out.println("Vezes o que o do/while rodou: " + numero);

        } while(numero < 10);

        boolean sair = false;

        do{
            System.out.println("Escolhe uma das opção abaixo");
            System.out.println(
                    "1-Cadastrar novo usuarui \n" +
                    "2-Editar usuario \n" +
                    "3- Excluir usuario \n" +
                    "0- Sair \n"
            );

            int opcao = leia.nextInt();
            switch (opcao) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    System.out.println("Cadastrar novo usuario");
                    break;
            }
        }while(!sair);

    }
}
