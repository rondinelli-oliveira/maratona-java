package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula203LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula214Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula215Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula215Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class Aula215StreamTest13 {
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
        Map<Aula215Promotion, List<Aula203LightNovel>> collect = lightNovels
                .stream()
                .collect(groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                ));
        System.out.println(collect);
        // Map<Category, Map<Promotion, List<LightNovel>>>

        Map<Aula214Category, Map<Aula215Promotion, List<Aula203LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(Aula203LightNovel::getCategory, groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                )));
        System.out.println(collect1);
    }
}
