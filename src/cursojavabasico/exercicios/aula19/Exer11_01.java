package cursojavabasico.exercicios.aula19;

public class Exer11_01 {

    public static void main(String[] args) {

        int[] a = {1, 4, 7, 10, 3, 8, 2, 9, 6, 5};
        int qtdPares = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                qtdPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + qtdPares);

    }

}
