package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class Aula166ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Rondinelli");
        nomes.add("Flavia");
        nomes.add("Gabriel");
        nomes.add("Felipe");

        System.out.println(nomes.remove("rondinelli"));
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("------------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i);
        }

        System.out.println("------------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
