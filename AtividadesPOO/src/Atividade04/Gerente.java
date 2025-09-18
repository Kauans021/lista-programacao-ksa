package Atividade04;

public class gerente extends Funcionario {
    private double bonus;

    public gerente() {
        super();
        this.bonus=0;
    }

    public Carro(String nome, double SalarioBase, ){
        super(marca,modelo,velocidade,Descricao);
        this.portas=portas;
    }


    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public void falar(){
        System.out.println("Marca do veiculo: "+getMarca()+"\nModelo do veiculo: "+getModelo()+" \nVelocidade maxima do veiuclo: "+ getSalarioBase()+"\nDescrição do veiuclo: "+getDescricao()+"\nNumeros de portas: "+getPortas());
    }
}