package cursojavabasico.exercicios.aula15;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        int valorMaior = 0;
        int valorMenor = 0;

        if (num1 > valorMaior) {
            valorMaior = num1;
        }
        if (num2 > valorMaior) {
            valorMaior = num2;

        }
        if (num3 > valorMaior) {
            valorMaior = num3;
        }

        //menor
        if (num1 < valorMenor) {
            valorMenor = num1;
        }
        if (num2 < valorMenor) {
            valorMenor = num2;

        }
        if (num3 < valorMenor) {
            valorMenor= num3;
        }
        System.out.println("Valor maior " + valorMaior);
        System.out.println("Valor menor " + valorMenor);
    }
}

