package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int nu1 = sc.nextByte();

        System.out.println("Digite um numero ");
        int nu2 = sc.nextByte();

        System.out.println("Digite um numero ");
        int nu3 = sc.nextByte();

        int temp = 0;


        if (nu1 < nu2) {
            temp = nu1;
            nu1 = nu2;
            nu2 = temp;
        }
        if (nu1 < nu3) {
            temp = nu1;
            nu1 = nu3;
            nu3 = temp;
        }

        if (nu2 < nu3) {
            temp = nu2;
            nu2 = nu3;
            nu3 = temp;
        }

        System.out.println("Numeros decrecentes " + nu1
                + "," + nu2 + "," + nu3);
    }
}
