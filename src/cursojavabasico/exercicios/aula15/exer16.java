package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer16 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor de A: ");
            double a = sc.nextDouble();

            if (a == 0) {
                System.out.println("Não é uma equação do segundo grau.");
            } else {

                System.out.print("Digite o valor de B: ");
                double b = sc.nextDouble();

                System.out.print("Digite o valor de C: ");
                double c = sc.nextDouble();

                double delta = b * b - 4 * a * c;// Cálculo do delta

                if (delta < 0) {
                    System.out.println("Não existem raízes reais.");
                }
                else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Raiz única: x = " + x);
                }
                else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                    System.out.println("Existem duas raízes reais:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }

            sc.close();

        }
}
