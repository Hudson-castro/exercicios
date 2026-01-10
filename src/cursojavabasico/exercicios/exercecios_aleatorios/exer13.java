package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();


        if (a != b) {
            int temp = a;
            a = b;
            b = temp;

            System.out.println("Novo valor de A " + a);
            System.out.println("Novo valor de B " + b);
        }else{
            System.out.println("Valores iguais");
            System.out.println("Valor de A " + a);
            System.out.println("Valor de B " + b);
        }


        sc.close();
    }
}
