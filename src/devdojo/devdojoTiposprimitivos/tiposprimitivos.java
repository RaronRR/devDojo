package devdojo.devdojoTiposprimitivos;

public class tiposprimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 11;
        long numeroLongo = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere= 87;
        String nome = "vegeta";

        System.out.println("A idade e: "+age +" anos");
        System.out.println(verdadeiro);
        System.out.println("char "+ caractere);
        System.out.println("Oi meu nome é: " + nome);
        System.out.println(numeroLongo + salarioDouble + salarioFloat + idadeByte +idadeShort);
        System.out.println(falso);
    }
}
