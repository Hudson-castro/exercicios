package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer03
{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Digite o numero A: ");
        int A = sca.nextInt();

        System.out.println("Digite o número b: ");
        int B = sca.nextInt();

        int soma = A + B ;

        System.out.print("Soma de  A + B: " + soma);

        sca.close();
    }

    }

