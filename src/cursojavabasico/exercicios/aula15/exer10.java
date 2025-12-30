package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char turno;
        do {

            System.out.println("Qual turno você estuda? ");

            System.out.println("M - matutino V - Vespetino N - noturno ");


             turno = sc.next().charAt(0);
            turno = Character.toUpperCase(turno); //Transforma o caractere em maiusculo sem precisa de logica

            if (turno != 'M' && turno != 'V' && turno != 'N') {
                System.out.println("Valor invalido");
            }
        } while (turno != 'M' && turno != 'V' && turno != 'N');


        if (turno == 'M') {
            System.out.println("Você estar no matutino! ");
        } else if (turno == 'V') {
            System.out.println("Você estar no vespertino!");
        } else  {
            System.out.println("Você esta no noturno!!");
        }


        sc.close();
    }
}
