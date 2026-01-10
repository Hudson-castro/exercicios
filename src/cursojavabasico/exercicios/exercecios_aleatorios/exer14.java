package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoAtual = 2026;

        System.out.println("Digite aqui o ano que você nasceu: ");
        int anoNascimento = sc.nextInt();

        int diasTotais = (anoAtual - anoNascimento) * 365;

        int anos = diasTotais / 365;
        int restoDias = diasTotais % 365;

        int meses = restoDias / 30;
        int dias = restoDias % 30;

        System.out.println(anos + " anos, " + meses
                + " meses e " + dias + " dias de vida");

        sc.close();
    }

}
