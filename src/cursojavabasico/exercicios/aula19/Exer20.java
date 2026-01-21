package cursojavabasico.exercicios.aula19;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cotacaoDolar = 5.37;
        double[] a = new double[5];

        for (int i = 0; i < a.length; i++) {

            System.out.println("Digite aqui a quantidade em dólar para converter: ");
            double valorEmDolar = sc.nextDouble();

            a[i] = valorEmDolar * cotacaoDolar;
            System.out.println(a[i]);
        }
        System.out.println("\nValores convertidos para reais: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A [" + i + "] = R$ " + a[i]);
        }
        sc.close();
    }

}
