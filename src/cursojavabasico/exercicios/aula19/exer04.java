package cursojavabasico.exercicios.aula19;

public class exer04 {
    public static void main(String[] args) {


        int[] a = {2, 4, 8, 9, 7, 6, 8, 4, 2, 6, 6, 44, 55, 6, 10};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            b[i] = a[i] * a[i];
            System.out.println("A[" + i + "] = " + a[i] + " -> B[" + i + "] = " + b[i]);

        }
    }
}
