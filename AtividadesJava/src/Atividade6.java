public class Atividade6 {
    // Operadores logicos
    public static void main(String[] args) {
        //operador E: &&
        //operador ou: ||
        //operador nao: !
        int a = 5, b = -5, x = 30, y= 9;
        boolean teste, verdadeiro = true, falso = false;
        teste = (a>b) || (a<b);
        System.out.println("(a>b) || (a<b): "+ teste);
        teste = (x > a) && (y > a);
        System.out.println("(x>s) || (y>a): "+ teste);
        teste = !verdadeiro;
        System.out.println("(Negação de um valor verdadeiro)"+ teste);

        teste = (y>a) || (y<a);
        System.out.println("(y>a) || (y<a): "+ teste);
        teste = (x < a) && (y < a);
        System.out.println("(x<a) || (y<a): "+ teste);
        teste = !verdadeiro;
        System.out.println("(Negação de um valor verdadeiro)"+ teste);
    }
}
