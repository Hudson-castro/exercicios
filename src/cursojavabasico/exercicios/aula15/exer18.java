package cursojavabasico.exercicios.aula15;

import java.util.Scanner;

public class exer18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia = sc.nextInt();

        System.out.println("Infore o mês: ");
        int mes = sc.nextInt();

        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();

        // && usa para validar  e || Usa pra detectar erros ou alternativas.

        if (dia >= 1 && dia <=  31 &&
            mes >= 1 && mes <= 12 && ano > 0 ){

    }else {
            System.out.println("Ano invalido ");
        }
        System.out.println(" " + dia + "/" + mes + "/" + ano);
    }
}
