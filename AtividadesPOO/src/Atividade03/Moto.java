package Atividade03;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto() {
        super();
        this.cilindradas = 110;
        this.setMarca(getMarca());
        this.setModelo(getModelo());
        this.setSalarioBase(getSalarioBase());
        this.setDescricao(getDescricao());
    }

    public Moto(String marca, String modelo, double velocidade, String descricao, int cilindradas) {
        super(marca, modelo, velocidade, descricao);
        this.descricao = descricao;
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void setMarca(String marca) {

        super.setMarca(marca);
    }

    public void setModelo(String modelo) {

        super.setModelo(modelo);
    }

    public void setSalarioBase(double salarioBase) {

        super.setSalarioBase(salarioBase);
    }

    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    public void falar() {
        System.out.println("Marca do veiculo: " + getMarca() + "\nModelo do veiculo: " + getModelo() + " \nVelocidade maxima do veiuclo: " + getSalarioBase() + "\nDescrição do veiuclo: " + getDescricao() + "\nCilindradas: " + getCilindradas());
    }
}
