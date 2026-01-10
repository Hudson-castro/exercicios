package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();

        if (a == b) {
            int soma = a + b;
            System.out.println("Soma de A + B: " + soma);
        } else {
            int c = a * b;

            System.out.println("Valor da multiplicação A * B =  " + c);
        }


        sc.close();
    }

}
