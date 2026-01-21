package cursojavabasico.exercicios.aula19;

public class Exer24 {
    public static void main(String[] args) {

       // int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
       int[] a = {0, 1, 2, 3, 0, 1, 6, 3, 1, 6};
        boolean validar = true;


        for (int i = 0; i < a.length; i++) {
           if (a[i] != a[a.length -1 -i ]){
               validar = true ;
               break;
           }
        }
        if (validar){
            System.out.println("O valor é palíndromo");
        }else {
            System.out.println("O valor NÃO é um palíndromo");
        }
    }
}
