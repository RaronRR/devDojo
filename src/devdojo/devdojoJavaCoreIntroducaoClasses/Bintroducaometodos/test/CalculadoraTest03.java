package devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.test;

import devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result); 
    }
}
