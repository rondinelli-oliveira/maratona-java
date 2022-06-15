package academy.devdojo.maratonajava.javacore.ZZClambidas.test;

import academy.devdojo.maratonajava.javacore.ZZClambidas.dominio.Aula198Anime;
import academy.devdojo.maratonajava.javacore.ZZClambidas.service.Aula198AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Referência a um método estático
//Reference to a static method
public class Aula198MephodReferenceTest01 {
    public static void main(String[] args) {
        List<Aula198Anime> animeList = new ArrayList<>(List.of(new Aula198Anime("Cavaleiros Do Zoodiaco", 1500),
                new Aula198Anime("Pluto", 700),
                new Aula198Anime("Mickey Mouse", 900)));
        animeList.sort((a1, a2) -> a1.getTitulo().compareTo(a2.getTitulo()));
        System.out.println(animeList);
        animeList.sort(Aula198AnimeComparators::compararPorTitulo);
        System.out.println(animeList);
        animeList.sort(Aula198AnimeComparators::compararPorEpisodios);
        System.out.println(animeList);
    }
}
