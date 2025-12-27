package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Converter metros para Centímetros");

        System.out.print("Digite aqui os metros: ");
        double metros = sc.nextDouble();

        double converter = metros * 100 ;
        System.out.print("Tranformação em centímetros: " + converter);

sc.close();
    }
}
