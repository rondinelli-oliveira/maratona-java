package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula169Produto;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula182QueueTest02 {
    public static void main(String[] args) {
        Queue<Aula169Produto> produtos = new PriorityQueue<>(new ProdutoPrecoComparator().reversed());
        produtos.add(new Aula169Produto(5L, "Tomate", 19.90));
        produtos.add(new Aula169Produto(1L, "Pimentao", 9.90));
        produtos.add(new Aula169Produto(4L, "Cenoura", 6.90));
        produtos.add(new Aula169Produto(3L, "Tv", 556.90));
        produtos.add(new Aula169Produto(2L, "Laptop", 1299.90));

        while(!produtos.isEmpty()){
            System.out.println(produtos.poll());
        }
    }
}
