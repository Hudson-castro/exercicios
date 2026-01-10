package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C;
        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();

        int soma = A + B;

        System.out.println("Soma de A + B " + soma);

        if (soma > C) {
            System.out.println("Soma de A + B é maior que C: " + C);
        } else {
            System.out.println("Soma de A + B é menor que C: " + C);
        }
        sc.close();
    }
}
