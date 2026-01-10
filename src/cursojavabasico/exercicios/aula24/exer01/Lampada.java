package cursojavabasico.exercicios.aula24.exer01;

public class Lampada {
    String marca = "Cristal";
    String cor = "Azul";
    int qtaLampadas = 5;
    double garantia = 6;

    @Override
    public String toString() {
        return " marca ='" + marca + "\n"
                +
                " cor = '" + cor + "\n" +
                " qtaLampadas = "
                + qtaLampadas + "\n"+
                " garantia = " + garantia ;
    }
}
