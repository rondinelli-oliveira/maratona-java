package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula203LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Aula214Category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Aula214StreamTest12 {
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
        Map<Aula214Category, List<Aula203LightNovel>> categoryAula203LightNovelMap = new HashMap<>();
        List<Aula203LightNovel> drama = new ArrayList<>();
        List<Aula203LightNovel> fantasy = new ArrayList<>();
        List<Aula203LightNovel> romance = new ArrayList<>();
        for (Aula203LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA:
                    drama.add(lightNovel);
                    break;
                case FANTASY:
                    fantasy.add(lightNovel);
                    break;
                case ROMANCE:
                    romance.add(lightNovel);
                    break;
            }
        }
        categoryAula203LightNovelMap.put(Aula214Category.DRAMA, drama);
        categoryAula203LightNovelMap.put(Aula214Category.FANTASY, fantasy);
        categoryAula203LightNovelMap.put(Aula214Category.ROMANCE, romance);
        System.out.println(categoryAula203LightNovelMap);

        Map<Aula214Category, List<Aula203LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(Aula203LightNovel::getCategory));
        System.out.println(collect);
    }
}
