package cursojavabasico.exercicios.aula19;

import java.text.DecimalFormat;

public class exer04_1 {
    public static void main(String[] args) {
        int[] a = {15, 65, 23, 56, 98, 45, 65, 12, 35, 78, 98, 54};
        double[] b = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = Math.sqrt(a[i]);

            DecimalFormat sc = new DecimalFormat("0,00");
            System.out.println("A[" + i + "] = " + a[i] + "-> B[" + i + "] = " + sc.format(b[i]));
        }
    }
}
