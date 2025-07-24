package devdojo.devdojoJavaCoreIntroducaoClasses.AintroducaoClasses.test;
import devdojo.devdojoJavaCoreIntroducaoClasses.AintroducaoClasses.dominio.Carro;
public class Carro01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro02 = new Carro();

        carro.nome = "Chevrole";
        carro.modelo = "Astra";
        carro.ano = 2000;

        carro02.nome = "BYD";
        carro02.modelo = "Dolphin";
        carro02.ano = 2024;

        carro = carro02;


        System.out.println("O carro é um " + carro.nome + ", modelo " + carro.modelo + ", ano " + carro.ano );
        System.out.println("O carro é um " + carro02.nome + ", modelo " + carro02.modelo + ", ano " + carro02.ano );

    }
}
