package cursojavabasico.exercicios.aula19;

public class Exer29 {
    public static void main(String[] args) {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        int[] c = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i + 10;

        }
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];

        }
        System.out.println("Vetor C final:");
        for (int i = 0; i < c.length; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }
}
