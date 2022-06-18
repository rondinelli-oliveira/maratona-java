package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula203LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Aula208StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(Aula203LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(Aula203LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
