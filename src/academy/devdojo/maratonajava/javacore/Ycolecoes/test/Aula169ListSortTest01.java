package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula169ListSortTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Rondinelli");
        nomes.add("Flavia");
        nomes.add("Gabriel");
        nomes.add("Felipe");
        nomes.add("Nenhum");
        nomes.add("teste");

        Collections.sort(nomes);

        List<Double> valores = new ArrayList<>();
        valores.add(100.21);
        valores.add(23.98);
        valores.add(21.21);
        valores.add(98.10);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println(valores);
        Collections.sort(valores);
        System.out.println(valores);
    }
}
