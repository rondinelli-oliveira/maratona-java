package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Aula87DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Aula87FileLoader;

public class Aula87DataLoaderTest01 {
    public static void main(String[] args) {
        Aula87DatabaseLoader databaseLoader = new Aula87DatabaseLoader();
        Aula87FileLoader fileLoader = new Aula87FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
