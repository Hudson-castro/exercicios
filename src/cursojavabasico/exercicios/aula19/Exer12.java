package cursojavabasico.exercicios.aula19;

public class Exer12 {

    public static void main(String[] args) {

        int[] a = {4, 5, 6, 9, 8, 7, 4};

        int soma = 0;

        for (int i = 0; i < a.length; i++) {

            soma += a[i];

        }
        System.out.println("Soma de todo os vetores de é = " + soma);
    }

}
