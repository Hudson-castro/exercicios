package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumero = 5 ;
        int count = 0 ;
        int valorMaior = 0;
        int valorMenor = 14654554;

        do {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();

            if (num > valorMaior) {
                valorMaior = num;
            }
            if (num < valorMenor) {
                valorMenor = num;
            }
            count++;
        }while (count < quantidadeNumero);
/*

        if (num2 > valorMaior) {
            valorMaior = num2;

        }
        if (num3 > valorMaior) {
            valorMaior = num3;
        }

        //menor

        }
        if (num2 < valorMenor) {
            valorMenor = num2;

        }
        if (num3 < valorMenor) {
            valorMenor = num3;
        }
        */

        System.out.println("Valor maior " + valorMaior);
        System.out.println("Valor menor " + valorMenor);


    }
}