package cursojavabasico.exercicios.aula24.exer01;

public class Main {
    public static void main(String[] args) {

        Lampada lamp = new Lampada();

        System.out.println(lamp.marca);
        System.out.println(lamp.cor);
        System.out.println(lamp.qtaLampadas);
        System.out.println(lamp.garantia);

        System.out.println();
        System.out.println("Segunda maneira de add valor as variaveis");
        System.out.println();

        Lampada lam01 = new Lampada();

        lamp.marca = "Belo";
        lamp.cor = "Vermelho";
        lamp.garantia = 56;
        lamp.qtaLampadas = 66;

        System.out.println(lamp);
    }
}
