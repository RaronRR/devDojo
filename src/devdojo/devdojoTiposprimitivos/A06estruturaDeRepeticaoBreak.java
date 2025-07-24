package devdojo.devdojoTiposprimitivos;

public class A06estruturaDeRepeticaoBreak {
    //imprimir os primeiros numeros de um deteminado valor
    public static void main(String[] args) {
         int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
        
            
            }
}
