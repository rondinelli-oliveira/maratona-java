package academy.devdojo.maratonajava.javacore.ZZClambidas.test;

import academy.devdojo.maratonajava.javacore.ZZClambidas.dominio.Aula198Anime;
import academy.devdojo.maratonajava.javacore.ZZClambidas.service.Aula198AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Referência a um construtor
//Reference to a constructor
public class Aula200MephodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<Aula198AnimeComparators> newAnimeComparators = Aula198AnimeComparators::new;
        Aula198AnimeComparators animeComparators = newAnimeComparators.get();
        List<Aula198Anime> animeList = new ArrayList<>(List.of(new Aula198Anime("Cavaleiros Do Zoodiaco", 1500),
                new Aula198Anime("Pluto", 700),
                new Aula198Anime("Mickey Mouse", 900)));
        animeList.sort(animeComparators::compararPorEpisodiosNaoEstatico);
        System.out.println(animeList);

        BiFunction<String, Integer, Aula198Anime> animeBiFunction = (titulo, episodio) -> new Aula198Anime(titulo, episodio);
        BiFunction<String, Integer, Aula198Anime> animeBiFunction2 = Aula198Anime::new;
        System.out.println(animeBiFunction.apply("Caverna do Dragao", 30));
        System.out.println(animeBiFunction2.apply("Caverna do Dragao", 30));
    }
}
