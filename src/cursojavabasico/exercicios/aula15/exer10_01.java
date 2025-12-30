package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer10_01 {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);



        char turno ;
    do {
        System.out.println("Qual turno você estuda?");
        System.out.println("M - Matutino | V - Vespertino | N - Noturno");

        turno = sc.next().charAt(0);
        turno = Character.toUpperCase(turno);

        if (turno != 'M' && turno != 'V' && turno != 'N'){
            System.out.println("Valor invalido tente novamente");
            System.out.println();
        }
} while (turno != 'M' && turno != 'V' && turno != 'N') ;

        switch (turno){

            case 'M' :
                System.out.println("Você estuda no turno matutino.");
                break;
            case 'V' :
                System.out.println("Você estuda no turno vespertino.");
                break;
            case 'N' :
                System.out.println("Você estuda no turno Noturno.");
                break;
            default:
                System.out.println("invalido");


        }


    }
}
