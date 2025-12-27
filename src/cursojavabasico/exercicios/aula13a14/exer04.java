package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota aqui: ");
        double nota01 = sc.nextDouble();

        System.out.println("Digite sua nota aqui: ");
        double nota02 = sc.nextDouble();

      double media = (nota01 + nota02) / 2 ;

        System.out.println("Média da nota: " + media) ;


sc.close();
    }
}
