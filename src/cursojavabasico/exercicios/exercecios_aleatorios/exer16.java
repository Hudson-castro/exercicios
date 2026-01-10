package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit para converter em Celsius:");
        double temperatura = sc.nextDouble();

        double celsius = (5 * (temperatura - 32) / 9);


        System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);

        sc.close();
    }
}
