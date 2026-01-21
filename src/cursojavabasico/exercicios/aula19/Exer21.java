package cursojavabasico.exercicios.aula19;

import java.text.DecimalFormat;

public class Exer21 {
        public static void main(String[] args) {

        double cotacaoDolar = 5.27;
        double[] a = new double[20];
        DecimalFormat sc = new DecimalFormat("0.00");

        for (int i = 0; i < a.length; i++) {
            a[i] = cotacaoDolar * (i + 1);

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + sc.format(a[i]));
        }
    }
}
