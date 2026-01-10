package cursojavabasico.exercicios.aula16a17;

import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;


        char[] estadosCivil = {'s', 'v', 'c', 'd'};


        do {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();

            if (nome.length() < 4) {
                System.out.println("Invalido!!!!");
            }

        } while (nome.length() < 4);

        do {
            System.out.println("Digite aqui sua idade: ");
            idade = sc.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade invalida!! ");
            }

        } while (idade < 0 || idade > 150);
        do {
            System.out.println("Digite aqui seu salario: ");
            salario = sc.nextDouble();

            if (salario < 0) {
                System.out.println("Valor invalido!! ");
            }
        } while (salario < 0);

        do {
            System.out.println("Digite o seu sexo M ou F");
            sexo = sc.next().charAt(0);

            if (!"m".equalsIgnoreCase(String.valueOf(sexo)) &&
                    !"f".equalsIgnoreCase(String.valueOf(sexo))) {

                System.out.println("Valor invalido");

            }
        } while (!"m".equalsIgnoreCase(String.valueOf(sexo)) &&
                !"f".equalsIgnoreCase(String.valueOf(sexo)));

        boolean encontrado = false;
        char estadoCivil ;

        do {
            System.out.println("Digite aqui seu estado civil: ");
            estadoCivil = sc.next().charAt(0);
            for (int i = 0; i < 4; i++) {
                if (estadosCivil[i] == estadoCivil) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado == false) {
                System.out.println(" Estado civil Invalido");
            }

        } while (encontrado == false);


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
        sc.close();
    }
}
