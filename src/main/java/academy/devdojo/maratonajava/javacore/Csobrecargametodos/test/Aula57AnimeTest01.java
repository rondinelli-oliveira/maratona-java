package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Aula57Anime;

public class Aula57AnimeTest01 {
    public static void main(String[] args) {
        Aula57Anime anime = new Aula57Anime();
        anime.init("Cavaleiros do Zoodiaco", "TV", 12, "Ação");
//        anime.setNome("Cavaleiros do Zoodiaco");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprimeDados();
    }
}
