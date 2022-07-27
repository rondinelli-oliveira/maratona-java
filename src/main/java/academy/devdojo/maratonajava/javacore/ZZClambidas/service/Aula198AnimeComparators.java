package academy.devdojo.maratonajava.javacore.ZZClambidas.service;

import academy.devdojo.maratonajava.javacore.ZZClambidas.dominio.Aula198Anime;

public class Aula198AnimeComparators {

    public static int compararPorTitulo(Aula198Anime a1, Aula198Anime a2) {
        return a1.getTitulo().compareTo(a2.getTitulo());
    }

    public static int compararPorEpisodios(Aula198Anime a1, Aula198Anime a2) {
        return Integer.compare(a1.getEpisodio(), a2.getEpisodio());
    }

    public int compararPorEpisodiosNaoEstatico(Aula198Anime a1, Aula198Anime a2) {
        return Integer.compare(a1.getEpisodio(), a2.getEpisodio());
    }
}
