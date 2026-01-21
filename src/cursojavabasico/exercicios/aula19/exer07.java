package cursojavabasico.exercicios.aula19;

public class exer07 {
    public static void main(String[] args) {

        int[] a = {10, 8, 36, 9, 8, 7, 9, 6, 8, 5, 3, 4, 2};
        int[] b = {1, 6, 8, 4, 5, 6, 9, 8, 7, 4, 5, 6, 9};

        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        System.out.println("Valor de C ");
        for (int i = 0 ; i < c.length; i++){
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }
}
