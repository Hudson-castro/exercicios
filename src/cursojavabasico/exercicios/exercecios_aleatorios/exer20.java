package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Random;
import java.util.Scanner;

public class exer20 {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Numero Aleatorio de 0 a 100: ");
        int numeroAleatorio = gerador.nextInt(100) ;

        System.out.println("Numero: " + numeroAleatorio);

    }
}
