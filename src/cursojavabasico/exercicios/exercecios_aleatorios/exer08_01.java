package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer08_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui o seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite aqui a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("SPeso ideal (Parabéns)");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau 1");
        }else if (imc < 40){
            System.out.println("Obesidade grau 2 (Severa)");
        }else {
            System.out.println("Obesidade grau 3 (Mórbida)");
        }


        sc.close();
    }
}