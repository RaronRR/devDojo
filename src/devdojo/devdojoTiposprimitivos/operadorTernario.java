package devdojo.devdojoTiposprimitivos;

public class operadorTernario {
    //doar se salario for maior que 5 mil
    public static void main(String[] args) {
       double Salario = 5000;
   String isPossoDoar = "Esse mes posso doar 500 reais";
   String isNaoPossoDoar = "Não é possivel fazer doação neste mês";
   String Resultado = Salario > 5000 ? isPossoDoar : isNaoPossoDoar; 
    System.out.println(Resultado);
}
   
    
}