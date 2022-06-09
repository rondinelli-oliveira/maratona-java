package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula169Produto;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula179Consumidor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula180MapTest03 {
    public static void main(String[] args) {
        Aula179Consumidor consumidor1 = new Aula179Consumidor("Rondinelli Oliveira");
        Aula179Consumidor consumidor2 = new Aula179Consumidor("Flávia Vieira");

        Aula169Produto produto1 = new Aula169Produto(5L, "Tomate", 19.90);
        Aula169Produto produto2 = new Aula169Produto(1L, "Pimentao", 9.50);
        Aula169Produto produto3 = new Aula169Produto(4L, "Cenoura", 3.20);
        Aula169Produto produto4 = new Aula169Produto(3L, "Tv", 11.20);
        Aula169Produto produto5 = new Aula169Produto(2L, "Laptop", 2.99);

        List<Aula169Produto> produtoConsumidor1 = List.of(produto1, produto2, produto3);
        List<Aula169Produto> produtoConsumidor2 = List.of(produto4, produto5);
        Map<Aula179Consumidor, List<Aula169Produto>> consumidorProduto = new HashMap<>();
        consumidorProduto.put(consumidor1, produtoConsumidor1);
        consumidorProduto.put(consumidor2, produtoConsumidor2);

        for (Map.Entry<Aula179Consumidor, List<Aula169Produto>> entry : consumidorProduto.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Aula169Produto produto : entry.getValue()) {
                System.out.println("    " + produto.getNome());
            }
        }
    }
}
