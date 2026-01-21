package cursojavabasico.exercicios.aula19;

public class exer08 {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 9, 8, 7, 8, 9};
        int[] b = {6, 4, 9, 4, 5, 4, 3, 7};
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            c[i] = a[i] * b[i];

        }
        System.out.println("Valor de C ");
        for (int i = 0; i < c.length; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }
}
