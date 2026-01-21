package cursojavabasico.exercicios.aula19;


public class exer10 {
    public static void main(String[] args) {
        int[] a = {1, 23, 4, 5, 7, 8, 7, 88, 9, 98};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] % 2;
        }
        for (int i = 0; i < b.length; i++) {

            System.out.println("A[" + i + "] = "
                    + a[i] + " | B[" + i + "] = " + b[i]);

        }
    }
}
