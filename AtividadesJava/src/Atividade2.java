public class Atividade2 {
    public static void main(String[] args){
        String nome = "Kauan";
        String sobrenome = "Soares";
        int idade = 22;
        double peso = 65;
        double altura = 1.75;
        double imc = 0;
        //Um script que imprima o nome e sobrenome da pessoa;
        System.out.println(nome + " " + sobrenome);
        //Imprima o ano de nascimento da pessoa;
        int anoNasc = 2025 - idade;
        System.out.println("Ano de nascimento: " + anoNasc);
        //Imprima o peso e a altura na mesma linha;
        String txtPesoAltura = "Peso: " + peso + "; Altura: " + altura;
        System.out.println(txtPesoAltura);
        //Imprima o IMC da pessoa;
        imc = peso/(altura*altura);
        System.out.println("Base calc IMC: " +peso+"/"+altura+"² = " + imc);
        //System.out.println("IMC é: " +  imc);



    }
}