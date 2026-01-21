package cursojavabasico.exercicios.aula19;

public class Exer28 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            b[a.length - 1 - i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
