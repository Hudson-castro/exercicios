package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double media = 0;
        do {


            System.out.println("Digite aqui sua primeira nota: ");
            nota1 = sc.nextDouble();

            System.out.println("Digite aqui sua segunda nota: ");
            nota2 = sc.nextDouble();


            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
                System.out.println("Nota Inválida");
            }
        } while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10);
        media = (nota1 + nota2) / 2;


        if (media >= 9.0 && media <= 10.0) {
            System.out.println("Conteito : A ");
            System.out.println("Media " + media + " Aprovado");
        } else if (media >= 7.5) {
            System.out.println("Conteito :  B ");
            System.out.println("Media " + media + " Aprovado");
        } else if (media >= 6.0) {
            System.out.println("Conteito : C ");
            System.out.println("Media " + media + " Aprovado");
        } else if (media >= 4.0) {
            System.out.println("Conteito : D ");
            System.out.println("Media " + media + " Reprovado");
        } else {
            System.out.println("Conteito : E ");
            System.out.println("Media " + media + " Reprovado");
        }

    }
}

