package cursojavabasico.exercicios.aula19;

import java.text.DecimalFormat;

public class Exer15 {
    public static void main (String[] args){


        int[] a = {2, 5, 4, 6, 9, 8, 7, 4, 5, 9, 3};

        int cont = 0;
        int contPar = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1){
                cont ++;

            }
            else {
                contPar ++ ;
            }
        }
        double porcPar = (contPar * 100.0) / a.length;
        double porcImpar = (cont * 100.0) / a.length;

        DecimalFormat df = new DecimalFormat("0,00");

        System.out.println("Vetor total: " + a.length + " elementos.");
        System.out.println("Percentual Pares: " + df.format(porcPar) + "%");
        System.out.println("Percentual Ímpares: " + df.format(porcImpar )+ "%");
    }
}
