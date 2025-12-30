package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer11_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBase;
        double percentual;

        System.out.println("Digite aqui seu salario: ");
        salarioBase = sc.nextDouble();


        if (salarioBase < 280) {
            percentual = 0.20;
        } else if (salarioBase < 700) {
            percentual = 0.15;
        } else if (salarioBase < 1500) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }

        double reajuste = salarioBase * percentual;
        double salarioFinal = salarioBase + reajuste;

        System.out.println("Salário atual: " + salarioBase);
        System.out.println("Percentual de reajuste: " + (percentual * 100) + "%");
        System.out.println("Valor do reajuste: " + reajuste);
        System.out.println("Salário final: " + salarioFinal);

    }
}

