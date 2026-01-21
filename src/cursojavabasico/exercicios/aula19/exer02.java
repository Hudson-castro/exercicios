package cursojavabasico.exercicios.aula19;

public class exer02 {
    public static void main(String[] args){
        int [] a = new int[5];

        int[] b = a ;

        for (int i = 0 ; i < b.length; i++){
            System.out.println(i);
        }
    }
}
