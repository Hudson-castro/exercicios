package cursojavabasico.exercicios.aula19;

import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {

        int[] a = {2, 4, 6, 8, 10, 12, 14, 16} ;
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * 2;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}