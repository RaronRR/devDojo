package devdojo.devdojoJavaCoreIntroducaoClasses.Bintroducaometodos.dominio;
//O metodo retorna alguma coisa ou não retorna nada
public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(26 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 ==0){
            return 0;
        }
        return num1/num2;
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("dentro altera dois numeros");
        System.out.println("num1" + numero1);
        System.out.println("num2" + numero2); 
    }



}
