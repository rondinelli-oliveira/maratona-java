package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.Aula90CalculadoraImposto;

public class Aula93ProdutoTest03 {
    public static void main(String[] args) {
        Aula90Produto produto = new Aula90Computador("Dell", 11000);

        Aula90Tomate tomate = new Aula90Tomate("Amarelo", 10);
        tomate.setDataValidade("11/11/2022");

        Aula90CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        Aula90CalculadoraImposto.calcularImposto(produto);
    }
}
