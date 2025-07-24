package devdojo.devdojoTiposprimitivos;

public class A08arraysMultimensional {
    public static void main(String[] args) {
        //Arrays dentro de arrays
        //1,2,3,4,5 Meses
        //31,28,31,30
        String[][] dias = new String[2][3];
        
        dias[0][0] = "fermento";
        dias[0][1] = "farinha";
        dias[0][2] = "açucar";

        dias[1][0] = "cacau";
        dias[1][1] = "forno";
        dias[1][2] = "pane";
       for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[0][2]);
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
       }
    }
}
