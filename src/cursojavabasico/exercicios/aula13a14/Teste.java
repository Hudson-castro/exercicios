package cursojavabasico.exercicios.aula13a14;

import java.util.List;

public class Teste {

    public static void main(String[] args) {

//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + " É par");
//            }
//        }
        List<String> nomes = List.of("Jardel", "Ju", "Bruno", "Carlos", "Leu", "Beu");

        for (String nome : nomes) {
            if (nome.startsWith("A")){
                System.out.println(nome);
            }else {
                System.out.println("invalido");
            }

        }
    }
}
