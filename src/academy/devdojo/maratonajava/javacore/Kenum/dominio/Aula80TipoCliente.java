package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum Aula80TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int valor;

    Aula80TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
