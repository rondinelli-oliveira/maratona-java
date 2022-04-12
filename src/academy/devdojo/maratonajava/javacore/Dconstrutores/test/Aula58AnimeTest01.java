package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Aula58Anime;

public class Aula58AnimeTest01 {
    public static void main(String[] args) {
        Aula58Anime anime = new Aula58Anime("Cavaleiros do Zoodiaco", "TV", 12, "Ação");
        Aula58Anime anime2 = new Aula58Anime();
        anime.imprimeDados();
        anime2.imprimeDados();
    }
}
