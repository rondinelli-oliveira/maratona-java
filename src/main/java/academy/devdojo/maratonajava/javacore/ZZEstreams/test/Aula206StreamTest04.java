package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aula206StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
        list.add(graphicDesigners);
        list.add(developers);
        list.add(students);

        for (List<String> people : list) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----------------------------------------");
        list.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
