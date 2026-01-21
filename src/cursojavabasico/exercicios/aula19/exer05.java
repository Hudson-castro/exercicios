package cursojavabasico.exercicios.aula19;

public class exer05 {
    public static void main(String[] args) {

        int[] a = {20, 12, 32, 20, 52, 65, 45, 78, 98, 65};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * i;
            System.out.println("A[" + i + "] = " + a[i] +
                    " | B[" + i + "] = " + b[i]);

        }
    }

}
