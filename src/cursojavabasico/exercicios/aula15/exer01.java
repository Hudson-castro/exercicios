package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui um numero: ");
        int numb = sc.nextInt();

        System.out.println("Digite aqui um numero: ");
        int numb2 = sc.nextInt();

       if (numb > numb2){
           System.out.println("Numero " + numb + " é maior que "+ numb2);

       }else {
           System.out.println("Numero " + numb2 + " é maior que " + numb);

       }
        sc.close();

    }

}
