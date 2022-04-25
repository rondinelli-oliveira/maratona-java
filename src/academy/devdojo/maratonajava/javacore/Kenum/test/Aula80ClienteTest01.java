package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Aula80Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Aula80Cliente.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Aula80TipoCliente;

public class Aula80ClienteTest01 {
    public static void main(String[] args) {
        Aula80Cliente cliente1 = new Aula80Cliente("Rondinelli Oliveira", Aula80TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Aula80Cliente cliente2 = new Aula80Cliente("Flávia Cristina", Aula80TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
