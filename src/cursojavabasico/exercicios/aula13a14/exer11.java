package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui o primeiro número inteiro: ");
        int a = sc.nextInt();
        System.out.println("Digite aqui o segundo número inteiro : ");
        int b = sc.nextInt();

        System.out.println("Digite aqui um numero real:");
        double real = sc.nextDouble();

        double calculo = (2 * a) * (b / 2.0 );
        System.out.println("Resultado a : " + calculo);

        double mult = (3 * a) + real ;

        System.out.println("Resultado b : " + mult);

        double cubo = (real * real * real);

        System.out.println("Resultado C : " + cubo);



        sc.close();

    }
}

