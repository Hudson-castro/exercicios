package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;
        int a = 1;

        while (cont <= 10) {

            int mult = a * cont;
            System.out.println(a + " x " + cont + " = " + mult);
            cont++;
        }
    }

}
