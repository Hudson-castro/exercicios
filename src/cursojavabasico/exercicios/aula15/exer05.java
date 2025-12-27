package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double nota01 = sc.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota02 = sc.nextDouble();

        double media = (nota01 + nota02) / 2 ;

        if (media < 10 && media >= 7 ){
            System.out.println("Aluno aprovado!!");

        } else if (media < 7) {
            System.out.println("Aluno reprovado!!");

        }else if (media == 10){
            System.out.println("aprovado nota 10");
        }

    }
}
// (se  maior ou = a 7 e menor que 10) = aprovado
// se  menor que 7 reprovado
// se  = a 10 aprovado distinção