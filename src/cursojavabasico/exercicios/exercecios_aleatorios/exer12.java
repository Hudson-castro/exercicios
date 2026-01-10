package cursojavabasico.exercicios.exercecios_aleatorios;

import java.util.Scanner;

public class exer12 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite aqui seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite aqui sua Idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Nome: " + nome + " Idade: " + idade);
            System.out.println("Maior de idade");

        }else {
            System.out.println("Nome: " + nome + " Idade: " + idade);
            System.out.println("Menor de idade");
        }
        sc.close();
    }
}
