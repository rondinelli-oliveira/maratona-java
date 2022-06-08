package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula169Produto;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aula175SetTest01 {
    public static void main(String[] args) {
        Set<Aula169Produto> produtos = new LinkedHashSet<>();
        produtos.add(new Aula169Produto(5L, "Tomate", 19.90, 0));
        produtos.add(new Aula169Produto(1L, "Pimentao", 9.90, 5));
        produtos.add(new Aula169Produto(4L, "Cenoura", 6.90, 0));
        produtos.add(new Aula169Produto(3L, "Tv", 556.90, 2));
        produtos.add(new Aula169Produto(2L, "Laptop", 1299.90, 0));

        for (Aula169Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

