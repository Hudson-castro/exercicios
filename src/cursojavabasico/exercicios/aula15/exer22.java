package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Impa ou Par? ");
        System.out.println("Digite um numero aqui: ");

        int numb = sc.nextInt();

        if (numb % 2 == 0 ){
            System.out.println(numb + " E PAR");
        }else
        {
            System.out.println(numb + " E ÍMPAR");
        }




        sc.close();
    }

}
