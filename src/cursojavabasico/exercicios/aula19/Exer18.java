package cursojavabasico.exercicios.aula19;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idade = new int[5];

        // 50 % foi feitor por IA

        for (int i = 0; i < idade.length; i++) {
            System.out.print("Digite a idade da posição " + i + ": ");
            idade[i] = sc.nextInt();
        }
        int maiorIdade = idade[0];
        int menorIdade = idade[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 0; i < idade.length; i++) {

            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                posMaior = i;
            }if (idade[i] < menorIdade){
                menorIdade = idade[i];
                posMenor = i;

            }
        }
        System.out.println("Maior idade: " + maiorIdade + " na posição " + posMaior);
        System.out.println("Menor idade: " + menorIdade + " na posição " + posMenor);

    }

}
