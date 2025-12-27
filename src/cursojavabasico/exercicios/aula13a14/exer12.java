package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Meu peso Ideal!!!");
        System.out.println("Digite aqui sua altura: ");
        double altura = sc.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58 ;

        System.out.println("Peso ideal é : " + pesoIdeal);

        sc.close();

    }
}
