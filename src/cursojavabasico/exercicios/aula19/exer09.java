package cursojavabasico.exercicios.aula19;

import java.text.DecimalFormat;

public class exer09 {
    public static void main(String[] args) {

        int[] a = {6, 9, 5, 6, 9, 5, 6, 9, 6};
        int[] b = {5, 2, 9, 49, 6, 8, 3, 6,9};

        double[] c = new double[a.length];

        for (int i = 0; i < a.length; i++) {

            c[i] = a[i] / (double) b[i];

            DecimalFormat df = new DecimalFormat("0,00");
            System.out.println("C[" + i + "] = " + df.format(c[i]));

        }
    }
}
