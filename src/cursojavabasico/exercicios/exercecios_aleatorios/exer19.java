package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int a = sc.nextInt();

        int cont = 0;

        while (cont <= 10) {
            int mult = a * cont;

            System.out.println(a + " x " + cont + " = " + mult);
            cont++;
        }
        System.out.println(" ");
        System.out.println("Exemplo com for");
        System.out.println(" ");
        for (cont = 1; cont <= 10; cont++) {
            System.out.println(a + " x " + cont + " = " + (a * cont));
        }
        sc.close();
    }
}
