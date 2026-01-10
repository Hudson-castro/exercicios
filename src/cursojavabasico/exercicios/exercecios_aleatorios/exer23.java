package cursojavabasico.exercicios.exercecios_aleatorios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi o tempo da viagem? ");
        double tempo = sc.nextDouble();

        System.out.println("Qual foi a velovidade média? ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litros = distancia / 12;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\n--- RESULTADO DA VIAGEM ---");
        System.out.printf("Tempo: %.2f horas%n", tempo);
        System.out.printf("Velocidade média: %.2f km/h%n", velocidade);
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Combustível gasto: %.2f litros%n", litros);



        sc.close();
    }
}
