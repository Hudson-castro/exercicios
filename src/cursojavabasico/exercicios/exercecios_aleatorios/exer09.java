package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota aqui: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota aqui: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota aqui: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3 ;

        System.out.printf("Média das notas: %.2f%n", media);

        if (media < 7.0){
            System.out.println("Reprovado!! ");
        }else {
            System.out.println("Aprovado");
        }
        sc.close();
    }
}
