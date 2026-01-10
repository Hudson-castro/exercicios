package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exemplos com varieveis temporais

        int a = 2;
        int b = 9;
        int c = 7;

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;

        }
        if (a < c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            int temp = b;
            b = c ;
            c = temp ;

        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}
