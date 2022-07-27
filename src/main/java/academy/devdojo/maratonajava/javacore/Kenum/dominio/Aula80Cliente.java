package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Aula80Cliente {
    private String nome;
    private Aula80TipoCliente tipoCliente;
    private Aula82TipoPagamento tipoPagamento;

    public Aula80Cliente(String nome, Aula80TipoCliente tipoCliente, Aula82TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
