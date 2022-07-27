package academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio;

public class Aula104LoginInvalidoException extends Exception {
    public Aula104LoginInvalidoException() {
        super("Login Inválido....");
    }

    public Aula104LoginInvalidoException(String message) {
        super(message);
    }
}
