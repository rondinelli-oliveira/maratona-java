package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula179Consumidor;

import java.util.ArrayList;
import java.util.List;

public class Aula183GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");


        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Aula179Consumidor("Midoriya"));

        for (Object o : lista) {
            System.out.println(o);
        }

    }

    private static void add(List lista, Aula179Consumidor consumidor) {
        lista.add(consumidor);
    }
}
