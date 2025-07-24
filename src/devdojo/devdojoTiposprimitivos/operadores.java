package devdojo.devdojoTiposprimitivos;

public class operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 22;
        System.out.println(numero02 + numero01 +" Valor ");
    
    int idade = 29;
    float salario = 3500f;
    boolean isDentroDaLei = idade>= 30 && salario >= 4612;
    boolean isForaDaLei = idade< 30 && salario >= 3381;
    System.out.println("isDentroDaLei "+isDentroDaLei );
    System.out.println("isForaDaLei "+isForaDaLei );
        
    double valorTotalCc= 200;
    double valorTatalPp= 10000;
    float valorPlayStation= 5000f;
    boolean isPlauStationCincoCompravel = valorTotalCc > valorPlayStation || valorTatalPp > valorPlayStation;
    System.out.println("isPlauStationCincoCompravel "+ isPlauStationCincoCompravel);
//Operadores de atribuição
// = += -= *= /= %=

        double bonus= 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus %= 2;
        bonus /= 2;
        System.out.println(bonus);




}
 
}
// &&(END) || (OR) !