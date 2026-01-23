package cursojavabasico.exercicios.aula19;

import java.util.ArrayList;

public class Exer30 {
    public static void main(String[] args) { // Algumas mudanças por ia

        int[] a = {5, 6, 9, 8, 7, 5, 6, 5, 2, 3, 8, 9, 7};

        ArrayList<Integer> b = new ArrayList<>(); // Exemplos mais dinamico
        ArrayList<Integer> c = new ArrayList<>();
//        int[] b = new int[a.length]; // exemplos com zeros sobrando
//        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            int par = a[i] % 2;

            if (par == 0) {
               b.add(a[i]);

            }else {
                c.add(a[i]);
            }
        }
        System.out.println("Valores pares: ");
        for (int valor : b){
            System.out.println(valor);
        }
        System.out.println("\nValores ímpares:");
        for(int valor : c) {
            System.out.println(valor);
        }
    }
}
