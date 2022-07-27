package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula169Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Aula171ProdutoByIdComparator implements Comparator<Aula169Produto> {

    @Override
    public int compare(Aula169Produto produto1, Aula169Produto produto2) {
        return produto1.getId().compareTo(produto2.getId());
    }
}

public class Aula170ProdutoTest01 {
    public static void main(String[] args) {
        List<Aula169Produto> produtos = new ArrayList<>();
        produtos.add(new Aula169Produto(5L, "Tomate", 19.90));
        produtos.add(new Aula169Produto(1L, "Pimentao", 9.90));
        produtos.add(new Aula169Produto(4L, "Cenoura", 6.90));
        produtos.add(new Aula169Produto(3L, "Tv", 556.90));
        produtos.add(new Aula169Produto(2L, "Laptop", 1299.90));
        for (Aula169Produto produto : produtos) {
            System.out.println(produto);
        }

        Collections.sort(produtos);
        System.out.println("-------------------------------------------------");
        for (Aula169Produto produto : produtos) {
            System.out.println(produto);
        }

        Collections.sort(produtos, new Aula171ProdutoByIdComparator());
        System.out.println("-------------------------------------------------");
        for (Aula169Produto produto : produtos) {
            System.out.println(produto);
        }

        produtos.sort(new Aula171ProdutoByIdComparator());
        System.out.println("-------------------------------------------------");
        for (Aula169Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
