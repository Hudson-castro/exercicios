package cursojavabasico.exercicios.aula16a17;

import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("lojas Tabajara");

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago;
        double troco;

        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = sc.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = "lojas Tabajara \n";
                System.out.println("Digite a quantidade de produtos da compra: ");
                qtdProdutos = sc.nextInt();

                total = 0;

                for (int i = 0; i < qtdProdutos; i++) {
                    System.out.println("Informe preço do produto " + i);
                    preco = sc.nextDouble();
                    total += preco;
                    output += " Produto " + i + ":R$ " + preco + "\n";
                }
                output += "Total: R$ " + total;

                System.out.println("Total: R$ " + total);

                System.out.println("Entre com o valor pago: ");
                valorPago = sc.nextDouble();

                output += "Dinheiro: R$ " + valorPago + "\n";

                troco = total - valorPago;

                output += "Troco: R$ " + troco;
                System.out.println(output);
            } else {
                sair = true;
            }
        } while (!sair);
    }

}
