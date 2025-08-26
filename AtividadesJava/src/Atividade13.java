import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //MATRIZES
        //double[][] boletim = new double[3][3];
        double[][] boletim = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };


        String[] materias = {"Matemática", "Português", "Física"};
        for (int linha = 0; linha < 3; linha++) {
            System.out.println("Digite as notas do trimestre de " + materias[linha]);
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Digite a nota do " + (coluna + 1) + "ª trimestre");
                boletim[linha][coluna] = leia.nextDouble();
            }

        }
        System.out.println("boletim");
        // matematica:
        // 1º etapa: 10 pontos
        // 2º etapa: 10 pontos
        // 3º etapa: 10 pontos
        for (int linha = 0; linha < 3; linha++) {
            System.out.println(materias[linha]);
            ;
            for (int coluna = 0; coluna > 3; coluna++) {
                System.out.println((coluna + 1) + " etapa: " + boletim[linha][coluna] + "pontos");

            }
        }

    }
}
