package academy.devdojo.maratonajava.javacore.ZZClambidas.dominio;

public class Aula198Anime {
    private String titulo;
    private int episodio;

    public Aula198Anime(String title, int quantity) {
        this.titulo = title;
        this.episodio = quantity;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEpisodio() {
        return episodio;
    }

    @Override
    public String toString() {
        return "Aula198Anime{" +
                "title='" + titulo + '\'' +
                ", quantity=" + episodio +
                '}';
    }
}
