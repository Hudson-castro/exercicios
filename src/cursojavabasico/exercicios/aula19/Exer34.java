package cursojavabasico.exercicios.aula19;

public class Exer34 {
    public static void main(String[] args) {

        int[] A = {3, 5, 8, 4, 10, 7, 6, 9, 2, 1};

        for (int i = 0; i < A.length; i++) {
            System.out.println("\nElemento A[" + i + "] = " + A[i]);
            System.out.println("Pares de 0 até " + A[i] + ": ");

            for (int j = 0; j < A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " ");
                }
            }
        }

    }
}
