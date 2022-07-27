package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula169Produto;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula179Consumidor;

import java.util.HashMap;
import java.util.Map;

public class Aula179MapTest02 {
    public static void main(String[] args) {
        Aula179Consumidor consumidor1 = new Aula179Consumidor("Rondinelli Oliveira");
        Aula179Consumidor consumidor2 = new Aula179Consumidor("Flávia Vieira");

        Aula169Produto produto1 = new Aula169Produto(5L, "Tomate", 19.90);
        Aula169Produto produto2 = new Aula169Produto(1L, "Pimentao", 9.50);
        Aula169Produto produto3 = new Aula169Produto(4L, "Cenoura", 3.20);
        Aula169Produto produto4 = new Aula169Produto(3L, "Tv", 11.20);
        Aula169Produto produto5 = new Aula169Produto(2L, "Laptop", 2.99);

        Map<Aula179Consumidor, Aula169Produto> consumidorProduto = new HashMap<>();
        consumidorProduto.put(consumidor1, produto1);
        consumidorProduto.put(consumidor2, produto4);

        for (Map.Entry<Aula179Consumidor, Aula169Produto> entry : consumidorProduto.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }
    }
}
