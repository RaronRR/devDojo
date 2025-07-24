package devdojo.devdojoJavaCoreIntroducaoClasses.AintroducaoClasses.test;

import devdojo.devdojoJavaCoreIntroducaoClasses.AintroducaoClasses.dominio.estudante;

public class Testestudante01 {
   public static void main(String[] args) {
        estudante Estudante = new estudante();
        Estudante.nome = "Raron";
        Estudante.idade = 19;
        Estudante.genero = 'M';
        System.out.println(Estudante.nome);
        System.out.println(Estudante.idade);
        System.out.println(Estudante.genero);
        System.out.println(Estudante);
    }
}
