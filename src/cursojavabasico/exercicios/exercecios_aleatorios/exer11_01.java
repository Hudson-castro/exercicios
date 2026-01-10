package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer11_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pagamento;
        double valorProduto;


        System.out.println("Valor do produto: ");
        valorProduto = sc.nextDouble();
        do {
            System.out.println("Escolha a forma de pagamento ");
            System.out.println(" 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                    "\n" +
                    " 2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                    "\n" +
                    " 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                    "\n" +
                    " 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
            System.out.println();
            pagamento = sc.nextInt();

            if (pagamento != 1 && pagamento != 2 && pagamento
                    != 3 && pagamento != 4) {
                System.out.println("Valor invalido");
            }

        } while (pagamento != 1 && pagamento != 2 && pagamento
                != 3 && pagamento != 4);


        double precoFinal = valorProduto;

        if (pagamento == 1) {
            precoFinal = valorProduto * 0.85;
        } else if (pagamento == 2) {
            precoFinal = valorProduto * 0.90;
        } else if (pagamento == 4) {
            precoFinal = valorProduto * 1.10;
        }

        System.out.printf("Valor final a pagar: R$ %.2f%n", precoFinal);

    sc.close();
}


}
