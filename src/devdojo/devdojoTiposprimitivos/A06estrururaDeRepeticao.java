package devdojo.devdojoTiposprimitivos;

public class A06estrururaDeRepeticao {
    public static void main(String[] args){
        //while, do while, for
        int count = 0;
        //precisa resultar em um valor booleano
        //toda vez que estiver usando um while precisa colocar um limitador
        while(count < 10){
            System.out.println(++count);       
        }
        count = 0;
        do{
            System.out.println("dentro do do-while"+ ++count);
            
        }
        //
        while (count < 10);

        for (int i = 1; i < 10 ; i++) {
           System.out.println("For" + i); 
        }
        
        
    }
}