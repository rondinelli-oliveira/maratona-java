package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Aula80Cliente;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Aula80TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Aula82TipoPagamento;

public class Aula80ClienteTest01 {
    public static void main(String[] args) {
        Aula80Cliente cliente1 = new Aula80Cliente("Rondinelli Oliveira", Aula80TipoCliente.PESSOA_FISICA, Aula82TipoPagamento.DEBITO);
        Aula80Cliente cliente2 = new Aula80Cliente("Flávia Cristina", Aula80TipoCliente.PESSOA_JURIDICA, Aula82TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(Aula82TipoPagamento.DEBITO.calculaDesconto(100));
        System.out.println(Aula82TipoPagamento.CREDITO.calculaDesconto(100));
    }
}
