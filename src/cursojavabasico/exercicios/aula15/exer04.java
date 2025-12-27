package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);


        if (letra == 'a'
                || letra == 'A'
                || letra == 'e'
                || letra == 'E'
                || letra == 'i'
                || letra == 'I'
                || letra == 'o'
                || letra == 'O'
                || letra == 'u'
                || letra == 'U') {

            System.out.println(letra + "  é uma Vogal");
        } else if (letra == 'b'
                || letra == 'c'
                || letra == 'd'
                || letra == 'f'
                || letra == 'g'
                || letra == 'h'
                || letra == 'j'
                || letra == 'l'
                || letra == 'k'
                || letra == 'm'
                || letra == 'n'
                || letra == 'p'
                || letra == 'q'
                || letra == 'r'
                || letra == 's'
                || letra == 't'
                || letra == 'v'
                || letra == 'x'
                || letra == 'y'
                || letra == 'z'
                || letra == 'w'

        ) {
            System.out.println( letra + " é uma Consoante");

        }else{
            System.out.println("Digito " + letra +" invalido !!!");
        }


        sc.close();
    }
}
