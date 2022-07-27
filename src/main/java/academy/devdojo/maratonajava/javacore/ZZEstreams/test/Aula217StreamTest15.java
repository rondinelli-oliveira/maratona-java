package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula203LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula214Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula215Promotion;

import java.util.*;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula215Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula215Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class Aula217StreamTest15 {
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
        Map<Aula214Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(Aula203LightNovel::getCategory, summarizingDouble(Aula203LightNovel::getPrice)));
        System.out.println(collect);
        // Map<Category, List<Promotion>>

        Map<Aula214Category, Set<Aula215Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(Aula203LightNovel::getCategory, mapping(Aula217StreamTest15::getAula215Promotion, toSet())));
        System.out.println(collect1);

        Map<Aula214Category, LinkedHashSet<Aula215Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(Aula203LightNovel::getCategory, mapping(Aula217StreamTest15::getAula215Promotion,
                        toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Aula215Promotion getAula215Promotion(Aula203LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
