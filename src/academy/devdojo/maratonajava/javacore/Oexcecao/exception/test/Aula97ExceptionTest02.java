package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import java.io.File;
import java.io.IOException;

public class Aula97ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso...." + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
