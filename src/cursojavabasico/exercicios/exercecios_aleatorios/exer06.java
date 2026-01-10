package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor lógico (true ou false): ");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Digite o segundo valor lógico (true ou false): ");
        boolean valor2 = sc.nextBoolean();

        if ((valor1 == true && valor2 == true) ||
                (valor1 == false && valor2 == false)) {

            System.out.println("Os dois valores são iguais: ");
        } else {
            System.out.println("Os valores são diferentes");
        }

        sc.close();
    }
}
