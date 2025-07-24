package devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.test;

import devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.dominio.Estudante;
import devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        ImpressoraEstudante impresora = new ImpressoraEstudante();
        
        estudante01.nome = "Goku";
        estudante01.idade = 50;
        estudante01.genero = 'M';

        estudante02.nome = "Vegeta";
        estudante02.idade = 55;
        estudante02.genero = 'M';

        estudante03.nome = "Android 18";
        estudante03.idade = 18;
        estudante03.genero = 'F';
        
        impresora.imprime(estudante01);
        impresora.imprime(estudante02);
        impresora.imprime(estudante03);
    }
    
    
}
