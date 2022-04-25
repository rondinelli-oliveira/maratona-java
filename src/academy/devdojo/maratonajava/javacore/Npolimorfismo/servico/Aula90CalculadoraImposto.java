package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Aula90Tomate;

public class Aula90CalculadoraImposto {

    public static void calcularImposto(Aula90Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Aula90Tomate) {
            Aula90Tomate tomate = (Aula90Tomate) produto;
            System.out.println(tomate.getDataValidade());

            String dataValidade = ((Aula90Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
