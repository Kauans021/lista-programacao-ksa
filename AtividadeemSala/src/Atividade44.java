import java.util.Scanner;

public class Atividade44 {
    public static void main(String[] args) {
        //44: Preencha um vetor de 5 posições com notas de alunos e mostre a média da turma.
        Scanner leia = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0, media = 0;

        System.out.println("Digite sua nota abaixo.");
        for(int i = 0; i< notas.length;i++){
            System.out.println((i+1) + "° Aluno:");
            notas[i] = leia.nextDouble();
            soma += notas[i];

        }


        media = soma / notas.length;
        System.out.println("A medida é:" + media);


    }
}
