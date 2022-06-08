package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula161Smartphone;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula169Produto;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Aula161Smartphone> {

    @Override
    public int compare(Aula161Smartphone o1, Aula161Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class Aula176NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Aula161Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Aula161Smartphone smartphone = new Aula161Smartphone("111111", "Motorola");
        set.add(smartphone);

        NavigableSet<Aula169Produto> produtos = new TreeSet<>();
        produtos.add(new Aula169Produto(5L, "Tomate", 19.90, 0));
        produtos.add(new Aula169Produto(1L, "Pimentao", 9.90, 5));
        produtos.add(new Aula169Produto(4L, "Cenoura", 6.90, 0));
        produtos.add(new Aula169Produto(3L, "Tv", 556.90, 2));
        produtos.add(new Aula169Produto(2L, "Laptop", 1299.90, 0));
        produtos.add(new Aula169Produto(10L, "Amora", 9.90, 0));
        produtos.add(new Aula169Produto(10L, "Amora", 9.90, 0));

        for (Aula169Produto produto : produtos) {
            System.out.println(produto);
        }

    }
}
