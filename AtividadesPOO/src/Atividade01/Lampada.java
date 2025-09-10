package Atividade01;

public class Lampada {
    private boolean ligado;
    private int brilho;
    private String cor;

    public Lampada() {
        this.ligado = false;
        this.brilho = 0;
        this.cor = "branca";
    }

    public Lampada(int brilho, String cor, boolean ligado) {
        this.setBrilho(brilho);
        this.cor = cor;
        this.ligado = ligado;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getBrilho() {
        return this.brilho;
    }

    public void setBrilho(int brilho) {
        if (brilho >= 0 && brilho <= 100) {
            this.brilho = brilho;
        }
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void aumentarBrilho(int valor) {
        setBrilho(this.brilho + valor);
    }

    public void reduzirBrilho(int valor) {
        setBrilho(this.brilho - valor);
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
    }
}