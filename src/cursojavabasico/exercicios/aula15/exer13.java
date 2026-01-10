package cursojavabasico.exercicios.aula15;

import java.util.List;
import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = 0;
        do {
            System.out.println("Digite aqui de 1 a 7 pra saber o dia da semana");
            dia = sc.nextInt();

            if (dia < 1 || dia > 7) {
                System.out.println("Valor invalido, digite de 1 a 7 apenas numeros ");
            }
        } while (dia < 1 || dia > 7);

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

        }




        sc.close();


//    List<String> nomes = List.of("Hudson", "Uva", "Jardel");
//
//    for(String nome : nomes) {
//        System.out.println(nome);
//    }

}

}
