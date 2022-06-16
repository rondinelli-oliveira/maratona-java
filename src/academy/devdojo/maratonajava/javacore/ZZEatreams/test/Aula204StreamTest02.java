package academy.devdojo.maratonajava.javacore.ZZEatreams.test;

import academy.devdojo.maratonajava.javacore.ZZEatreams.dominio.Aula203LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1. Ordene LightNovel por título
//1. Sort LightNovel by title
//2. Recupere os 3 primeiros títulos de light novels com preço inferior a 4
//2. Retrieve the first 3 titles light novels with price less than 4
public class Aula204StreamTest02 {

    private static List<Aula203LightNovel> lightNovels = new ArrayList<>(List.of(
            new Aula203LightNovel("Caverna do Dragao", 8.99),
            new Aula203LightNovel("Pluto", 3.90),
            new Aula203LightNovel("Caveleiros do Zodiaco", 5.99),
            new Aula203LightNovel("Pato Donald", 2.99),
            new Aula203LightNovel("Mickey Mouse", 5.99),
            new Aula203LightNovel("Pica-pau", 1.99),
            new Aula203LightNovel("Snoop", 4.00)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream().sorted(Comparator.comparing(Aula203LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(Aula203LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
