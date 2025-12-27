package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area do circulo");

        System.out.print("Digite aqui a Area do circulo: ");
        int area = sc.nextInt();
        Double converter = Math.PI * (area * area ) ;

        System.out.print("Area do circulo " + converter);

        sc.close();
    }
}
