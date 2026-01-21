package cursojavabasico.exercicios.aula19;

public class Exer23 {
    public static void main(String[] args) {

        int[] a = new int[10];


        boolean validar = false;

        int par = 0 ;
        for (int i = 0; i < a.length; i++) {
         a [i] = (int) Math.round(Math.random() * 100); // Apenas para gerar números aleatorios pra o vetor
            par = a[i] % 2 ;

            if (par != 0 ) {
                validar = true;
                System.out.println("Número ímpar encontrado: " + a[i]);
                break; //Parar o loop do for

            }else {
                System.out.println("Número par " + a[i]);
            }
        }
    }
}
