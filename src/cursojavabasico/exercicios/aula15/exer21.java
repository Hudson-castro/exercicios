package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer21 {   //Feito por IA dificuldade na logica de divisão de valor finais

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o valor do seu saque? ");
        int valorSaque = sc.nextInt(); // Usando int para facilitar os cálculos de notas

        // Validação do intervalo
        if (valorSaque >= 10 && valorSaque <= 600) {

            int valorRestante = valorSaque; // Criamos uma variável que vai diminuindo

            // 1. Notas de 100
            int notas100 = valorRestante / 100;
            valorRestante = valorRestante % 100; // O que sobrar aqui vai para as próximas notas

            // 2. Notas de 50
            int notas50 = valorRestante / 50;
            valorRestante = valorRestante % 50;

            // 3. Notas de 10
            int notas10 = valorRestante / 10;
            valorRestante = valorRestante % 10;

            // 4. Notas de 5
            int notas5 = valorRestante / 5;
            valorRestante = valorRestante % 5;

            // 5. Notas de 1 (O que sobrou por último é tudo nota de 1)
            int notas1 = valorRestante;

            // Exibição dos resultados
            System.out.println("Para sacar R$ " + valorSaque + " o programa fornece:");
            if (notas100 > 0) System.out.println(notas100 + " nota(s) de R$ 100");
            if (notas50 > 0) System.out.println(notas50 + " nota(s) de R$ 50");
            if (notas10 > 0) System.out.println(notas10 + " nota(s) de R$ 10");
            if (notas5 > 0) System.out.println(notas5 + " nota(s) de R$ 5");
            if (notas1 > 0) System.out.println(notas1 + " nota(s) de R$ 1");

        } else {
            System.out.println("Valor inválido! O saque deve ser entre 10 e 600 reais.");
            sc.close();
        }
    }
}