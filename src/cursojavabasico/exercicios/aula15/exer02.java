package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui um numero: ");
        int num = sc.nextInt();

        if (num >= 1 ){
            System.out.println("Numero " + num + " é positivo");
        } else if (num < 0) {
            System.out.println("Numero " + num + " é negativo ");

        }else {
            System.out.println("Valor invalido");
        }

        sc.close();
    }
}
