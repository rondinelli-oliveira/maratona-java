package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula203LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula214Category;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Aula216StreamTest1 {
    private static List<Aula203LightNovel> lightNovels = new ArrayList<>(List.of(
            new Aula203LightNovel("Caverna do Dragao", 8.99, Aula214Category.FANTASY),
            new Aula203LightNovel("Pluto", 10.90, Aula214Category.FANTASY),
            new Aula203LightNovel("Caveleiros do Zodiaco", 5.99, Aula214Category.DRAMA),
            new Aula203LightNovel("Pato Donald", 2.99, Aula214Category.FANTASY),
            new Aula203LightNovel("Mickey Mouse", 5.99, Aula214Category.FANTASY),
            new Aula203LightNovel("Pica-pau", 1.99, Aula214Category.FANTASY),
            new Aula203LightNovel("Pica-pau", 1.99, Aula214Category.FANTASY),
            new Aula203LightNovel("Snoop", 4.00, Aula214Category.ROMANCE)
    ));


    public static void main(String[] args) {
        Map<Aula214Category, Long> collect = lightNovels.stream().collect(groupingBy(Aula203LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Aula214Category, Optional<Aula203LightNovel>> collect1 = lightNovels.stream()
                .collect(groupingBy(Aula203LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(Aula203LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Aula214Category, Aula203LightNovel> collect2 = lightNovels.stream().collect(groupingBy(Aula203LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Aula203LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Aula214Category, Aula203LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(Aula203LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Aula203LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
