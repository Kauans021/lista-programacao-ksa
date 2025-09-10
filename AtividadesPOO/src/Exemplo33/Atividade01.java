package Atividade01;
public class Lampada1 {
    //Crie a classe Lampada com atributos privados: ligada (boolean), brilho (int 0–100), cor
    //(String).
    //Crie construtor padrão (desligada, brilho 0, cor "branca") e construtor completo.
    //Implemente métodos: ligar() , desligar() , aumentarBrilho(int) ,
    //reduzirBrilho(int) , mudarCor(String) .
    //Valide no setter de brilho para manter 0–100.
    //Em main , crie 2 objetos e demonstre as ações.
    private Boolean ligado;
    private int brilho = 0-100;
    String cor = "branco";

    public Lampada1(){
        this.ligado = false;
        this.brilho = 0;
        this.cor = "";

    }
    public Lampada1(int brilho, String cor, boolean ligado){
        this.ligado = ligado;
        this.brilho = brilho;
        this.cor = "branca";

    }

    public boolean getLigado(){return this.ligado;}

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getBrilho(){return this.brilho;}

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


}
