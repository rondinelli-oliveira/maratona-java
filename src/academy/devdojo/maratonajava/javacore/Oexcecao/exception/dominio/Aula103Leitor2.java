package academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Aula103Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2");
    }
}