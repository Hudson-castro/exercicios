package cursojavabasico.exercicios.aula19;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int contador = 0;

        for (int i = 0; i <vetorA.length ; i++) {
            System.out.println("Escreva sua idade: ");
            vetorA[i] = sc.nextInt();

            if (vetorA[i] > 35) {
                contador = contador + 1 ;
            }

        }
        System.out.println("Quantidade de pessoas com mais de 35 anos: " + contador);
    }
}
