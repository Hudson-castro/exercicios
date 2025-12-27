package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui seu Sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.println("Digite aqui seu altura!! ");
        double altura = sc.nextDouble();
        System.out.println("Digite aqui seu peso!! ");
        double peso = sc.nextDouble();

        if (sexo == 'H' || sexo == 'h') {
            double pesoideal = (72.7 * altura) - 58;
            if (peso < pesoideal) {
                System.out.println("Peso Abaixo " + pesoideal);

            } else if (peso == pesoideal) {
                System.out.println("Peso ideal " + pesoideal);

            } else {
                System.out.println("Peso acima " + pesoideal);
            }

        }
        if (sexo == 'm' || sexo == 'M') {
            double pesoideal = (62.1 * altura) - 44.7;

            if (peso < pesoideal) {
                System.out.println("Peso Abaixo " + pesoideal);

            } else if (peso == pesoideal) {
                System.out.println("Peso ideal " + pesoideal);

            } else {
                System.out.println("Peso acima " + pesoideal);
            }

        }

        sc.close();
    }
}