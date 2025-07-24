package devdojo.devdojoTiposprimitivos;

public class A07arrays03 {
    public static void main(String[] args) {
    
        //int []numeros = new int[3];
        int [] numeros02 = {1,2,3,4,5};
        
        for(int i = 0; i < numeros02.length; i++){
            System.out.println(numeros02[i]);
        }
        for (int num : numeros02) {
            System.out.println(num);
        }  
    } 
}
