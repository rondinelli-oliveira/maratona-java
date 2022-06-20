package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula203LightNovel;

import java.util.ArrayList;
import java.util.List;

public class Aula210StreamTest08 {
    private static List<Aula203LightNovel> lightNovels = new ArrayList<>(List.of(
            new Aula203LightNovel("Caverna do Dragao", 8.99),
            new Aula203LightNovel("Pluto", 10.90),
            new Aula203LightNovel("Caveleiros do Zodiaco", 5.99),
            new Aula203LightNovel("Pato Donald", 2.99),
            new Aula203LightNovel("Mickey Mouse", 5.99),
            new Aula203LightNovel("Pica-pau", 1.99),
            new Aula203LightNovel("Pica-pau", 1.99),
            new Aula203LightNovel("Snoop", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(Aula203LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(Aula203LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);
    }
}
