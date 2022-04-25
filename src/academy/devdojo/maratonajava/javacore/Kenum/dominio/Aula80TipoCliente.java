package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum Aula80TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;

    Aula80TipoCliente(int valor) {
        this.VALOR = valor;
    }
}
