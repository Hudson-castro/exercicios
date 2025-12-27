package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a temperatura em graus Farenheit: ");
        double graus = sc.nextDouble();

        double celsius =  (graus - 32) * 5 / 9 ;

        System.out.println("Valor cpnvertido para Celsius: " + celsius);
        sc.close();
    }
}


