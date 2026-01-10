package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui o seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite aqui a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura) ;

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc > 18.6 && imc < 24.9) {
            System.out.println("Peso ideal (Parabéns)");
        }else if (imc > 25.0 && imc < 29.9){
            System.out.println("Levemente acima do peso");
        }else if (imc > 30.0 && imc < 34.9){
            System.out.println("Obesidade grau 1 ");
        } else if (imc > 35.0 && imc < 39.9) {
            System.out.println("Obesidade grau 2 (Severa)");

        }else if (imc >= 40){
            System.out.println("Obesidade grau 3 (Móbida)");
        }
        sc.close();
    }

}
