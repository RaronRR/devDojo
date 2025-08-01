package devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] cash;
        public void imprimir(){
            System.out.println("Nome do Funcionario: " + this.name);
            System.out.println("Idade do Funcionario: " + this.age);


            for(double valor: cash){
                System.out.println(valor + "");
            }

        }
        public void media(){
            double media = 0;
            for(double valor: cash){
                media += valor;
            }
            media /= cash.length;
            System.out.println("Media do Funcionario: " + media);
        }
}
