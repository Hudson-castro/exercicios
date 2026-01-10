package cursojavabasico.exercicios.exercecios_aleatorios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Faça um algoritmo que leia o valor do salário
mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o
 Salário mínimo R$ 1.293,20).*/

public class exer04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = 1293.20;

        System.out.println("Digite aqui o valor do seu salário: ");
        double meuSalario = sc.nextDouble();

        double mediaSalario =meuSalario / salario;
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("O usuário ganha aproximadamente " +
                dc.format(mediaSalario)
               + " salários mínimos");

        sc.close();
    }
}
