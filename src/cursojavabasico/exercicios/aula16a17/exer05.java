package cursojavabasico.exercicios.aula16a17;

import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int popA;
        int popB;
        int cont = 0;
        double taxaA;
        double taxaB;


        System.out.println("Digite aqui o numero de polução de (A) e a sua taxa de crecimento:");
        System.out.print("População de A: ");
        popA = sc.nextInt();
        System.out.print("Taxa de população: ");
        taxaA = sc.nextDouble();

        System.out.println("Digite aqui o numero de polução de (B) e a sua taxa de crecimento:");
        System.out.print("População de B: ");
        popB = sc.nextInt();
        System.out.print("Taxa de população de B: ");
        taxaB = sc.nextDouble();

        while (popA < popB) {
            popA = (popA / 100) * (int) taxaA;
            popB = (popB / 100) * (int) taxaB;
            cont++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População A: " + popB);
        System.out.println("Qtd anos: " + cont);

        sc.close();


    }

}
