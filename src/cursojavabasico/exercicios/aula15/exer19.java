package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numb;
        int centenas = 100;
        int dezenas = 10;

        do {
            System.out.println("Digite aqui um numero inteiro: ");

            numb = sc.nextInt();


            if (numb > 0 && numb < 1000) {

                int valor1 = numb / centenas;
                int valor2 = (numb % centenas) / dezenas;
                int valor3 = numb % 10;

                System.out.println(numb + " = " + valor1
                        + " centenas, " + valor2
                        + " Dezenas, " + valor3 + " Unidades");
            }  else {
                System.out.println(" Digite um valor entre 0 a 1000!!! ");
            }

        } while (numb != 1 && numb != 1000);

    }
}
