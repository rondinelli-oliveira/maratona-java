package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula92Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.Aula90CalculadoraImposto;

public class Aula90ProdutoTest01 {
    public static void main(String[] args) {
        Aula90Computador computador = new Aula90Computador("LG", 3000);
        Aula90Tomate tomate = new Aula90Tomate("Verde", 3);
        Aula92Televisao televisao = new Aula92Televisao("Sansung", 5000);

        Aula90CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------------");
        Aula90CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------------");
        Aula90CalculadoraImposto.calcularImposto(televisao);
    }
}
