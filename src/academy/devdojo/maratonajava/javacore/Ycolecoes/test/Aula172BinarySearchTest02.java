package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula169Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula172BinarySearchTest02 {
    public static void main(String[] args) {
        Aula171ProdutoByIdComparator byIdComparator = new Aula171ProdutoByIdComparator();
        List<Aula169Produto> produtos = new ArrayList<>();
        produtos.add(new Aula169Produto(5L, "Tomate", 19.90));
        produtos.add(new Aula169Produto(1L, "Pimentao", 9.90));
        produtos.add(new Aula169Produto(4L, "Cenoura", 6.90));
        produtos.add(new Aula169Produto(3L, "Tv", 556.90));
        produtos.add(new Aula169Produto(2L, "Laptop", 1299.90));

//        Collections.sort(produtos);
        produtos.sort(new Aula171ProdutoByIdComparator());
        for (Aula169Produto produto : produtos) {
            System.out.println(produto);
        }

        Aula169Produto produtoToSearch = new Aula169Produto(2L, "Laptop", 1299.90);

        System.out.println(Collections.binarySearch(produtos, produtoToSearch, byIdComparator));
    }
}
