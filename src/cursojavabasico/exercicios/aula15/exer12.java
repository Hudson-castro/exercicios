package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer12 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Folha de pagamento");

        System.out.println("Digite aqui o valor por hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Digite aqui a quantidade de horas: ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora * horas;


        double percentualIR;
        double percentualINSS = 0.10;
        double percentualSindicato = 0.03;
        double percentualFGTS = 0.11;

        if (salarioBruto <= 900) {
            percentualIR = 0.0;
        } else if (salarioBruto <= 1500) {
            percentualIR = 0.05;
        } else if (salarioBruto <= 2500) {
            percentualIR = 0.10;
        } else {
            percentualIR = 0.20;
        }


        double valorIR = salarioBruto * percentualIR;
        double valorINSS = salarioBruto * percentualINSS;
        double valorSindicato = salarioBruto * percentualSindicato;
        double valorFGTS = salarioBruto * percentualFGTS;

        double totalDescontos = valorIR + valorINSS + valorSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        // Saída
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR: R$ " + valorIR);
        System.out.println("(-) INSS: R$ " + valorINSS);
        System.out.println("(-) Sindicato: R$ " + valorSindicato);
        System.out.println("FGTS (11%): R$ " + valorFGTS);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        sc.close();
    }
}
