package cursojavabasico.exercicios.aula16a17;

import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = null;
        String senha = null;
        do {

            System.out.println("Digite o nome do usuario: ");
            nome = sc.nextLine();

            System.out.println("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(nome)) {
                System.out.println("Valor invalido!!! ");
            }

        } while (senha.equals(nome));


        sc.close();
    }
}
