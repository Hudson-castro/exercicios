package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o lado A do triangulo");
        a = sc.nextInt();

        System.out.println("Digite o lado B do triangulo");
        b = sc.nextInt();

        System.out.println("Digite o lado C do triangulo");
        c = sc.nextInt();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Não é triângulo");
        } else if (a == b && b == c) {
            System.out.println("É  uma Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles");
        } else if (a != b && a != c && b != c ) {
            System.out.println("Escaleno");
            
        }
        sc.close();
    }
}
