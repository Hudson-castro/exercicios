package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double alturaFranciso = 1.50;
        double alturaSara = 1.10;
        int anos = 0;

        while (alturaSara <= alturaFranciso) {
            alturaFranciso += +0.02;
            alturaSara += +0.03;
            anos++;
        }
        System.out.println("Serão necessários " +
                anos + " anos para Sara ser mais alta que Francisco.");
        sc.close();
    }
}
