package devdojo.devdojoTiposprimitivos;

public class estruturaCondicional {
   public static void main(String[] args) {
       int age = 22;
       boolean comprarBebida = age >= 21;

       if(age >=18){
            System.out.println("Pode entrar");
       }else{
            System.out.println("Vai criar vergonha na cara");
       }     
       
       if(comprarBebida == true){
            System.out.println("Pode comprar bebida");
       }else{
            System.out.println("Não pode comprar bebida");
       }

    }
   

}
