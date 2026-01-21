package cursojavabasico.exercicios.aula19;

public class Exer13 {
    public static void main(String[] args) {

        int[] a = {2, 5, 4, 6, 9, 8, 7, 4, 5, 9};
        int soma = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 5 == 0) {
                soma += a[i];

            }
        }
        System.out.println("Soma dos multiplos de 5 = " + soma);


    }
}
