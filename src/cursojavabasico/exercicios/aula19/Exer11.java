package cursojavabasico.exercicios.aula19;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int qtdPares = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor da posição " + i + ":");
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0){
                qtdPares++;

            }
            System.out.println("Quantidade de números pares: " + qtdPares);
        }
    }
}