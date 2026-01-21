package cursojavabasico.exercicios.aula19;

public class Exer27 {
    public static void main(String[] args) {

        int[] a = new int[10];
        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i] < 7) {
                b[i] = 'a';
            }
            else if (a[i] == 7) {
                b[i] = 'b';

            }
            else if (a[i] > 7 && a[i] < 10) {
                b[i] = 'c';
            }
            else if (a[i] == 10) {
                b[i] = 'd';
            }
            else
                b[i] = 'e';

            System.out.println(b[i]);
        }


    }
}
