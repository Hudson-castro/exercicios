package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer11 {
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

            if(pagamento != 1 && pagamento != 2 && pagamento
                    != 3 && pagamento != 4){
                System.out.println("Valor invalido");
            }

        } while (pagamento != 1 && pagamento != 2 && pagamento
                != 3 && pagamento != 4);


        if (pagamento == 1) {
            double desconto15 = valorProduto * 0.15;
            double precoFinal = valorProduto - desconto15;

            System.out.println("Forma de Pagamento \n À " +
                    "Vista em Dinheiro ou Pix, recebe 15% de desconto \n" +
                    "Valor final: " + precoFinal);

        } else if (pagamento == 2) {
            double desconto10 = valorProduto * 0.10;
            double precoFinal = valorProduto - desconto10;
            System.out.println("Forma de Pagamento \n À Vista no cartão de " +
                    "crédito, recebe 10% de desconto \n" +
                    "Valor final: " + precoFinal);
        } else if (pagamento == 3) {
            System.out.println(" Forma de Pagamento\n Parcelado no " +
                    "cartão em duas vezes, preço normal do produto " +
                    "sem juros \n Valor final: " + valorProduto);

        } else if (pagamento == 4) {
            double juros10 = valorProduto * 0.10;
            double precoFinal = valorProduto + juros10;

            System.out.println("Forma de Pagamento\n Parcelado no cartão em três vezes " +
                    "ou mais, preço normal do produto mais juros de 10%\n Valor final: " + precoFinal);
        }
        sc.close();
    }
}
