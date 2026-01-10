package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int antecessor = numero - 1 ;
        int sucessor = numero + 1 ;

        System.out.println("Antessesor: " + antecessor);
        System.out.println("Sucessor: "+sucessor);
        sc.close();
    }
}
