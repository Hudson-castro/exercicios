package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        int par = numero % 2;

        if (par == 0) {
            System.out.println("par");

        } else {
            System.out.println("impar");

        }
        if (numero >= 0) {

            System.out.println("Positivo");
        } else {
            System.out.println("negativo");
      }

            sc.close();

    }
}