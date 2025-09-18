package Atividade04;

public class Vendedor extends Funcionario {
    double comissao;

    public Vendedor() {
        super();
        this.comissao=0;
    }

    public Carro(String nome, double SalarioBase, double comissao){
        super(nome, SalarioBase);
        this.comissao=comissao;
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