package Atividade01;

import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lampada lampada = new lampada(true,100,"branca");
        lampada.falar();
        lampada lampadaDois = new lampada(false,0,"azul");
        lampadaDois.falar();

        lampadaDois.setaumentarBrilho(scanner.nextInt());
        lampadaDois.falar();
    }
}