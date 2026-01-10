package cursojavabasico.exercicios.aula24.exer02;

public class Livro {

    String titulo;
    String autor;
    int pagina;
    int numeroDePaginas;


    @Override
    public String toString() {
        return
                "titulo = " + titulo + "\n"
                        + "autor = " + autor + "\n"
                        + "pagina = " + pagina + "\n"

                        +"numeroDePaginas = " + numeroDePaginas;
    }
}
