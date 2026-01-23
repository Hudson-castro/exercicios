package cursojavabasico.exercicios.aula19;

public class Exer32 {
    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("\nTabuada do " + a[i] + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
        }


        }
    }

