package devdojo.devdojoTiposprimitivos;

public class condicionalSwitch {
    public static void main(String[] args) {
        //imprima um dia da semana, considerando 1 como domingo
      /*byte dia = 5;
        //cahar,int, byte, short, enum, String -> valores que podem ser usado dentro de um switch
        switch (dia) {
            case 1 :
                System.out.println("Domingo");
            break;
            case 2 :
                System.out.println("Seg");
            break;
            case 3 :
                System.out.println("Ter");
            break;
            case 4 :
                System.out.println("Qua");
            break;
            case 5 :
                System.out.println("Qui");
            break;
            case 6 :
                System.out.println("Sex");
            break;
            case 7 :
                System.out.println("Sab");
            break;
            default :
                System.out.println("Escreveu numero errado");
        }

        char genero = 'm';
        switch (genero) {
            case 'f':
                System.out.println("Você escolhei o genero Feminino");
            break;
            case 'm':
                System.out.println("Você escolheu o genero Masculino");
            break;
            default:
            System.out.println("Ainda não esserimos outros generos");
        } */  
        byte diaDaSemana = 7;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Dom, final de semana");    
            break;
            case 2:
                System.out.println("Seg, dia util");    
            break;
            case 3:
                System.out.println("Ter, dia util");    
            break;
            case 4:
                System.out.println("Qua, dia util");    
            break;
            case 5:
                System.out.println("Qui, dia util");    
            break;
            case 6:
                System.out.println("Sex, dia util");    
            break;
            case 7:
                System.out.println("Sab, final de semana");    
            break;    
            default:
                System.out.println("Ou você é burro, ou é final de semana");
            break;
        }
    
    
    }
    
}