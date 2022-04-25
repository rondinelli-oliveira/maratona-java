package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Aula80Cliente {
    public enum TipoPagamento {
        DEBITO, CREDITO
    }

    private String nome;
    private Aula80TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Aula80Cliente(String nome, Aula80TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
