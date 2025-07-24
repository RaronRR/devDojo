package devdojo.devdojoTiposprimitivos;

public class exercicio {
    public static void main(String[] args) {
        //imparo ou par
        int number = 2;
        if(number % 2 == 0){
            System.out.println("o numero "+ number + "é par");
        }else{
            System.out.println("O numero "+ number +"é impar");
        }
        // Media
        double Nota01 = 7;
        double Nota02 = 9.5;
        double Nota03 = 1;
        double media = Nota01 + Nota02 + Nota03 / 3;
        if(media >=6){
            System.out.println("Parabéns você foi aprovado, sua nota é: " + media);
        }else{
            System.out.println("Fora de média");
        }
        // Carteira de motorista
        int age = 20;
        if(age >= 18){
            System.out.println("Você já pode tirar a carteira de motorista");
        }else{
            System.out.println("Você ainda é menor de idade");
        }
        /*  Positivo e Negativo
        int numero = 2;
        if(numero > 0){
            System.out.println("Seu numero é positivo");
        }else if(numero < 0){
        System.out.println("Seu numero é negativo");
        }else{
            System.out.println("Seu numero é zero");
        }
        *///Desafio

        int idade = 60;
        if(idade > 0 && idade<=12){
            System.out.println("Você é uma criança");
        }else if(idade > 13 && idade<=17){
            System.out.println("Você é um adlecente");
        }else if(idade >= 18 && idade<=59 ){
            System.out.println("Você é um adulto");
        }else{
            System.out.println("Você é um idoso");
        }
    }
}
