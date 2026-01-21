package cursojavabasico.exercicios.aula19;

public class Exer26 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = a.length - i; //gerar valores  diferentes

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;

            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
            System.out.println("A[" + i + "]=" + a[i] +
                            " B[" + i + "]=" + b[i] +
                            " C[" + i + "]=" + c[i]
            );
        }
    }
}
