package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula146NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/rondinelli/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./rondinelli/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
