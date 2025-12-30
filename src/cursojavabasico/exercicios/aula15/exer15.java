package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui o lado 1 do triagulo");
        int lado1 = sc.nextInt();

        System.out.println("Digite aqui o lado 2 do triagulo");
        int lado2 = sc.nextInt();

        System.out.println("Digite aqui o lado 3 do triagulo");
        int lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3
                && lado1 + lado3 > lado2
                && lado2 + lado3 > lado1){

            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("EQUILÁTRO");

            }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("ISÓSCELES");

            }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3 )
            {
                System.out.println("ESCALENO");

            }
        }else {
            System.out.println("Não é um triângulo");
        }


    }
}
