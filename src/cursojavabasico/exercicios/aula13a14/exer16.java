package cursojavabasico.exercicios.aula13a14;

import java.util.Scanner;

public class exer16 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho em metros quadrado da área que dev ser pintada: ");
        double area = sc.nextDouble();

        double litros = area / 3;
        double latas = litros / 18;
        double preco = latas * 80;

        System.out.println("Quantidade de latas: " + (int) latas);
        System.out.printf("Preço total: R$ %.2f%n", preco);

        sc.close();

    }

}