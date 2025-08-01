package devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.test;

import devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.name = "Raron";
        funcionario01.age = 19;
        funcionario01.cash = new double[]{1598.14,2000.98,2500};

        funcionario01.imprimir();
        funcionario01.media();
    }
}
