package devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
    //toda ver que for criar um metodo para colocar um valor dentro de um atributo
    //é necessario comecçar digitando a palavra set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
        if (idade < 18){
            System.out.println("Ainda é de menor de 18 anos");
        }
        return;
    }

    public String getNome(){
        return nome;
    }

}
