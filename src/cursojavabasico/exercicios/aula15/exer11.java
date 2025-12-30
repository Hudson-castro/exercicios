package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Organizações TABAJARA! ");

        double salarioBase;

        System.out.println("Digite aqui o seu salario: ");
        salarioBase = sc.nextInt();

        double reajuste_20 = salarioBase * 0.20;
        double reajuste_15 = salarioBase * 0.15;
        double reajuste_10 = salarioBase * 0.10;
        double reajuste_05 = salarioBase * 0.05;

        if (salarioBase < 280) {
            double salarioFinal = salarioBase + reajuste_20;
            System.out.println("Salario Atual: " + salarioBase
                    + "\nReajuste de 20% valor total: " + reajuste_20
                    + " \nSalario final: " + salarioFinal);

        }
        else if (salarioBase >= 280 && salarioBase < 700) {
            double salarioFinal = salarioBase + reajuste_15;
            System.out.println("Salario Atual: " + salarioBase
                    + "\nReajuste de 15% valor total: " + reajuste_15
                    + " \nSalario final: " + salarioFinal);
        }
        else if (salarioBase >= 700 && salarioBase < 1500) {
            double salarioFinal = salarioBase + reajuste_10;
            System.out.println("Salario Atual: " + salarioBase
                    + "\nReajuste de 10% valor total: " + reajuste_10
                    + " \nSalario final: " + salarioFinal);
        }else {
            double salarioFinal = salarioBase + reajuste_05;
            System.out.println("Salario Atual: " + salarioBase
                    + "\nReajuste de 05% valor total: " + reajuste_05
                    + " \nSalario final: " + salarioFinal);
        }
    }
}
