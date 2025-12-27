package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frutaMaisBarato = "";
        double valor = 0;
        double menorValor = 5454544 ;

        System.out.println("Valor da manga");
        valor = sc.nextDouble();

        if (valor < menorValor){
            menorValor = valor ;
            frutaMaisBarato = "Manga";
        }

        System.out.println("Valor da jaca ");
        valor = sc.nextDouble();

        if (valor < menorValor){
            menorValor = valor ;
            frutaMaisBarato = "Jaca";
        }

        System.out.println("Valor da uva ");
        valor = sc.nextDouble();

        if (valor < menorValor){
            menorValor = valor ;
            frutaMaisBarato = "uva";
        }

        System.out.println("O produto mais barato é a " + frutaMaisBarato
                + " valor " + menorValor);


    }

}
