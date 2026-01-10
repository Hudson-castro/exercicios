package cursojavabasico.exercicios.aula16a17;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nu;
        do {

            System.out.println("Digite um numero de 0 a 10");
            nu = sc.nextInt();

            System.out.println("Valor: " + nu);

            if (nu < 0 || nu > 10) {
                System.out.println("Valor invalido");
            }

//            if ( 0 > nu || 10 < nu) {
//                System.out.println("Valor invalido ");
//            }

        } while ( 0 > nu || 10 < nu);

    }
}
