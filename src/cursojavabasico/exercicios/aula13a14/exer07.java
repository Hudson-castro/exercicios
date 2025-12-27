package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui área do quadrado: ");
        int area = sc.nextInt();

        double valorDeArea = (area * area) ;

        System.out.println("Valor da área do quadrado: "  + valorDeArea);
        System.out.println("Valor ao dobro da área: " + (area * 2));
    sc.close();
}

}
