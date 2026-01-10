package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

//Feito por IA problemas na lógicas

public class exer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor da hora/aula: ");
        double valorHoraAula = sc.nextDouble();

        System.out.print("Digite o número de aulas no mês: ");
        int numeroAulas = sc.nextInt();

        System.out.print("Digite o percentual de desconto do INSS: ");
        double inss = sc.nextDouble();

        // Cálculos
        double salarioBruto = valorHoraAula * numeroAulas;
        double desconto = salarioBruto * (inss / 100);
        double salarioLiquido = salarioBruto - desconto;

        // Saída
        System.out.println("\nSalário bruto: R$ " + salarioBruto);
        System.out.println("Desconto do INSS: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        sc.close();
    }
}
