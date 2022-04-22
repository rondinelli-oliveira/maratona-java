package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Aula80Cliente {
    private String nome;
    private Aula80TipoCliente tipoCliente;

    public Aula80Cliente(String nome, Aula80TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula80TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Aula80TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }
}
