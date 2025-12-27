package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqio op valor por hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Digite aqui o valor por hora: ");
        double horas = sc.nextDouble();

        double salario =  valorHora * horas ;
        System.out.print("Valor do meu sálario ao mês: " + salario);
        sc.close();
    }
}


