package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula169Produto;

import java.util.LinkedList;
import java.util.List;

public class Aula174IteratorTest01 {
    public static void main(String[] args) {
        List<Aula169Produto> produtos = new LinkedList<>();
        produtos.add(new Aula169Produto(5L, "Tomate", 19.90, 0));
        produtos.add(new Aula169Produto(1L, "Pimentao", 9.90, 5));
        produtos.add(new Aula169Produto(4L, "Cenoura", 6.90, 0));
        produtos.add(new Aula169Produto(3L, "Tv", 556.90, 2));
        produtos.add(new Aula169Produto(2L, "Laptop", 1299.90, 0));

//        Iterator<Aula169Produto> produtoIterator = produtos.iterator();
//        while (produtoIterator.hasNext()) {
//            if (produtoIterator.next().getQuantidade() == 0) {
//                produtoIterator.remove();
//            }
//        }

        produtos.removeIf(produto -> produto.getQuantidade() == 0);

        System.out.println(produtos);
    }
}
