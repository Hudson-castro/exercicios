package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer14 {

        public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);

            System.out.println("Digite aqui a quantidade de kg de peixe: ");
            double peixe = sc.nextDouble();

            if (peixe > 50) {
                System.out.println("Você Outrapassou o peso permitido: ");
                double multa = ( peixe - 50) * 4.00 ;

                System.out.println("Valor aplicado por quilos é de R$ 4,00:  " + (peixe - 50)) ;
                System.out.print("Valor da multa a mais: " + multa);


            }else {
                System.out.println("Peso ideal não se aplica a multa! ");
            }
        }
    }