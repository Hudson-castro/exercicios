package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        int resultado =  a / b ;
        int resto = a % b ;

        System.out.println("Quociente: " + resultado);
        System.out.println("Resto: " + resto);
    }
}
