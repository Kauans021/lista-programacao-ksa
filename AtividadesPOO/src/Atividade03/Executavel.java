package Atividade03;

public class Executavel {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto("Honda","biz",190,"Melhor que CG",110);
        carro.falar();
        moto.falar();
    }
}