package cursojavabasico.exercicios.aula19;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] result = new double[5];

        for (int i = 0; i < nota1.length; i++) {

            System.out.println("Aluno " + (i + 1));
            System.out.println("Digite aqui sua nota 1º bimestre: ");
            nota1[i] = sc.nextDouble();

            System.out.println("Digite aqui sua nota 2º bimestre: ");
            nota2[i] = sc.nextDouble();

            result[i] = (nota1[i] + nota2[i]) / 2;

        }
        System.out.println("Resultados: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print("Aluno " + (i + 1) + " - Média: " + result[i] + " - ");

            if (result[i] >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado: ");
            }
        }
    }
}
