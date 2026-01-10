package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

// Faça um algoritmo que leia um valor qualquer
// e imprima na tela com um reajuste de 5%.

public class exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double numero = sc.nextDouble();

        double reajuste = numero * 0.05;
        double total = numero+ reajuste ;

        System.out.println("Tivemos um reajuste de 5%: " + total);
        sc.close();
    }
}
