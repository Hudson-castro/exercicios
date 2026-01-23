package cursojavabasico.exercicios.aula19;

public class Exer33 {
    public static void main(String[] args) {

        int[] a = {5, 6, 4, 8, 2, 3, 14, 5, 65};

        for (int i = 0; i < a.length; i++) {

            int num = a[i];
            boolean primo = true;

            if (num < 2) {
                primo = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println(num + " é primo");
            } else {
                System.out.println(num + " não é primo");
            }
        }
    }
}
