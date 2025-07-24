package devdojo.devdojoTiposprimitivos;

public class estruturaCondicional02 {
    public static void main(String[] args) {
        int age = 18;
        if(age < 15){
            System.out.println("categoria Infantil");
        }else if(age >= 15 && age <18){
            System.out.println("categoria juvenil");
        }else{
            System.out.println("adulto");
        }

    }
}
