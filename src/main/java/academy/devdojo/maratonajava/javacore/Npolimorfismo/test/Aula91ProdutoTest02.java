package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Tomate;

public class Aula91ProdutoTest02 {
    public static void main(String[] args) {
        Aula90Produto produto = new Aula90Computador("Dell", 11000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------------------------");

        Aula90Produto produto2 = new Aula90Tomate("Amarelo", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
