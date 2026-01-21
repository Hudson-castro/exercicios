package cursojavabasico.exercicios.aula19;

public class exer06 {
    public static void main(String[] args) {

        int[] a = {5, 6, 4, 8, 2, 3, 1, 4, 1, 9};
        int[] b = {9, 2, 6, 5, 4, 8, 9, 9, 4, 6};

        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
           c[i] = a[i] + b[i];
        }
        System.out.println("vetor C: ");
        for (int i = 0; i < c.length; i++){
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }
}
