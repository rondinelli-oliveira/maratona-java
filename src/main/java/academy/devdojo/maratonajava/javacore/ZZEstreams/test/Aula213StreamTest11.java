package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula203LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Aula213StreamTest11 {
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
        System.out.println(lightNovels.stream().count());
        System.out.println((long) lightNovels.size());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(Aula203LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(Aula203LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(Aula203LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(Aula203LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(Aula203LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(Aula203LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(Aula203LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(Aula203LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
