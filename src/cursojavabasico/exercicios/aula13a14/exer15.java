package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = sc.nextDouble();

        System.out.println("Quantas horas você trabalhou? ");
        double horasT = sc.nextDouble();

        double salarioBruto = valorHora * horasT ;
        double imposto = salarioBruto * 0.11 ;
        double inss = salarioBruto *  0.08 ;
        double sindicato = salarioBruto * 0.05 ;

        double salarioLiquido = salarioBruto - (imposto + inss + sindicato)  ;

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Pagou " + inss + " de INSS");
        System.out.println("Pagou " + sindicato + " ao sendicato");
        System.out.println("Valor Liquido " + salarioLiquido);


    sc.close();
    }

    }
