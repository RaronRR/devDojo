package devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.test;

import devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lufy");
        pessoa.setIdade(17);
        pessoa.imprimir();



    }
}

//Modificadores de acesso private, get, set