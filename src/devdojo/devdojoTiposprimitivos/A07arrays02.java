package devdojo.devdojoTiposprimitivos;

public class A07arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0
        // char = '\u0000' ''
        // boolean = false
        //String = null 
        String[] idade= new String[5];
        idade[0] = "Raron";
        idade[1] = "Leticia";
        idade[2] = "Cristian";
        idade[3] = "Suelha";
        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }
        //variavel.lenght ira retorna o tamanho do Arrays
    }
}
