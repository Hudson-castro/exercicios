package cursojavabasico.exercicios.aula19;

public class Exer14 {
    public static void main(String[] args) {


        int[] a = {2, 5, 4, 6, 9, 8, 7, 4, 5, 9, 3};
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                soma += a[i];
                cont++;

                System.out.println("Ímpar encontrado: " + a[i]);
            }
        }
        if (cont > 0) {
            int media = soma / cont;


            System.out.println("Soma dos ímpares: " + soma);
            System.out.println("Quantidade de ímpares: " + cont);
            System.out.println("Média aritmética dos ímpares: " + media);
        } else {
            System.out.println("Não existem números ímpares no vetor.");
        }
    }
}
