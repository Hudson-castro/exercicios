package cursojavabasico.exercicios.aula19;

public class Exer31 {
    public static void main(String[] args) {

        int[] a = {5, 9, 8, 5, 4, 12, 3, 5};
        int[] b = new int[a.length];

        int inicio = 0;       //posição para pares
        int fim = b.length - 1;//posição para ímpares

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                b[inicio] = a[i];
                inicio++; //anda pra frente
            } else {
                b[fim] = a[i];
                fim--; // anda pra trás
            }
        }
        System.out.println("Vetor organizado (pares primeiro):");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
