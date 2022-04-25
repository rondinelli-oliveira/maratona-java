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
        Aula80TipoCliente tipoCliente = Aula80TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        Aula80TipoCliente tipoCliente1 = Aula80TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente1.getNomeRelatorio());
        Aula80TipoCliente tipoCliente2 = Aula80TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
        Aula80TipoCliente tipoCliente3 = Aula80TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
        System.out.println(tipoCliente3);
    }
}
