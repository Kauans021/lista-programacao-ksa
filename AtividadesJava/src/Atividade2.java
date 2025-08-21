public class Atividade2 {
    public static void main(String[] args){
        String nome = "Kauan";
        String sobrenome = "Soares";
        int idade = 22;
        double peso = 65;
        double altura = 1.75;
        double imc = 0;

        System.out.println(nome + " " + sobrenome);

        int anoNasc = 2025 - idade;
        System.out.println("Ano de nascimento: " + anoNasc);

        String txtPesoAltura = "Peso: " + peso + "; Altura: " + altura;
        System.out.println(txtPesoAltura);

        imc = peso/(altura*altura);
        System.out.println("Base calc IMC: " +peso+"/"+altura+"² = " + imc);




    }
}