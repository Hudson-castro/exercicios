package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double farenheit =  (celsius * 9 / 5) + 32 ;

        System.out.println("Valor convertido para Fareenheit: " + farenheit);
        sc.close();
    }
}
