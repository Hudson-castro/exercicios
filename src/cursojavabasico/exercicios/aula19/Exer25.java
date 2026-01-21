package cursojavabasico.exercicios.aula19;

public class Exer25 {
    public static void main(String[] args) {

        int[] a = new  int[10];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[i] = 1
                ;
            } else {
                b[i] = 0;
            }
            System.out.println("A[" + i + "] = " + a[i]);
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}
