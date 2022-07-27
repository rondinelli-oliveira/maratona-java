package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import java.io.File;
import java.io.IOException;

public class Aula97ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso...." + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
