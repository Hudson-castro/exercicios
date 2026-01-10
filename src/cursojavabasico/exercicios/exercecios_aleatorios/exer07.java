package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();


        int ordem;

        if (valor1 > valor2 && valor1 > valor3) {
            if (valor2 > valor3) {
                System.out.println("Valor " + valor1 + " " + valor2 + " " + valor3);
            } else {
                System.out.println("Valor " + valor1 + " " + valor3 + " " + valor2);
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            if (valor1 > valor3){
                System.out.println("Valor " + valor2 + " " + valor1 + " " + valor3);
            }else {
                System.out.println("Valor " + valor2 + " " + valor3 + " " + valor1);
            }
        }else {
            if (valor1 > valor2 ) {
                System.out.println("Valor " + valor3 + " " + valor1 + " " + valor2);
            }else {
                System.out.println("Valor " + valor3 + " " + valor2 + " " + valor1);
            }
        }


        sc.close();
    }
}
