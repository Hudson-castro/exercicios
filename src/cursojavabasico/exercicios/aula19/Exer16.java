package cursojavabasico.exercicios.aula19;

import java.text.DecimalFormat;

public class Exer16 {
    public static void main(String[] args) {

        int[] a = {10, 15, 20, 12, 15, 30, 5, 15, 18, 14};

        int somaMenor15 = 0;
        int qtdIgual15 = 0;
        int somaMaior15 = 0;
        int qtdMaior15 = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < 15) {
                somaMenor15 += a[i];

            } else if (a[i] == 15) {
                qtdIgual15++;

            } else {
                somaMaior15 += a[i];
                qtdMaior15++;
            }
        }

        System.out.println("Vetor Analisado...");

        System.out.println("a) Soma dos elementos menores que 15: " + somaMenor15);

        System.out.println("b) Quantidade de elementos iguais a 15: " + qtdIgual15);

        DecimalFormat df = new DecimalFormat("0,00");
        if (qtdMaior15 > 0) {
            double media = somaMaior15 / (double) qtdMaior15; // Cast para double para ter precisão
            System.out.println("c) Média dos elementos maiores que 15: " + df.format(media));
        } else {
            System.out.println("c) Não houveram números maiores que 15 para calcular a média.");
        }
    }
}
