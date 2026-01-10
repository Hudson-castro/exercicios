package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite aqui sua primeira nota: ");
        double nota1 = sc.nextInt();
        System.out.println("Digite aqui sua segunda nota: ");
        double nota2 = sc.nextInt();
        System.out.println("Digite aqui sua terceira nota: ");
        double nota3 = sc.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10) {
            System.out.println("Medía: " + media + " Aprovado com distinção");
        } else if (media >= 7 && media < 10) {
            System.out.println("Medía: " + media + " Aprovado ");
        }
        else {
            System.out.println("Medía: " + media + " Reprovado");
        }

        sc.close();
    }
}
