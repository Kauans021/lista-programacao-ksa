import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = ""; // variável nome tipo "texto"
        int idade2 = 0; //variável idade tipo inteiro

        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite sua idade: ");
        idade2 = leia.nextInt();

        System.out.println("Seu nome é " + nome);
        System.out.println("Você tem " + idade2 + " anos de idade.");


        //resposta 1
        System.out.println("Digite sua idade!");
        int idade = leia.nextInt();
        if(idade>=18){
            System.out.println("você é de maior!");
        } else{
            System.out.println("você é de menor!");
        }


        //resposta 2
        System.out.println("Digite o sexo: (m,f)");
        char opcao = leia.next().toLowerCase().charAt(0);
        System.out.println("Você e do sexo: ");
        switch (opcao){
            case 'm':
              System.out.println("Masculino");
              break;
            case'f':
               System.out.println("Feminina");
               break;
            default:
            System.out.println("opção invalida!");
            break;
        }




    }
}
