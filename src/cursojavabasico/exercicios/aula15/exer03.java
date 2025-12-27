package cursojavabasico.exercicios.aula15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu sexo (M) masculino (F) feminino ? ");
        char sexo = sc.next().charAt(0);

        if (sexo == 'M' || sexo == 'm' ){
            System.out.println("Masculino");

        } else if(sexo == 'F' || sexo == 'f' ){
                System.out.println("Feminino");

        }else {
            System.out.println( sexo + " invalido");
        }

        sc.close();
    }
}
