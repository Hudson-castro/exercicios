package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite aqui sua primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite aqui sua segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite aqui sua terceira nota:");
        double nota3 = sc.nextDouble();
        System.out.println("Digite aqui sua quarta nota:");
        double nota4 = sc.nextDouble();

        double media  = (nota1 + nota2 + nota3 + nota4) / 4 ;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Media do aluno: " + media);

if (media < 7.0){
    System.out.println("Reprovado");
}else {
    System.out.println("Aprovado");
}
        sc.close();
    }
}
