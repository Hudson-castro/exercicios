package cursojavabasico.exercicios.aula19;

public class Exer22 {

    public static void main(String[] args) {

        int[] a = new int[10];
        int qtdZero = 0;
        int qtdUm = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round(Math.random() * 1);

            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                qtdZero++;
            }if (a[i] == 1 ){
                qtdUm++;
            }

        }
        double percentual = (qtdZero / 10.0) * 100;
        System.out.println("Percentual de zeros: " + percentual + "%");

        percentual = (qtdUm / 10.0) * 100;
        System.out.println("Percentual de Ums: " + percentual + "%");
        }
    }

