package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Aula60Anime;

public class Aula60Animetest01 {
    public static void main(String[] args) {
        Aula60Anime anime = new Aula60Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
