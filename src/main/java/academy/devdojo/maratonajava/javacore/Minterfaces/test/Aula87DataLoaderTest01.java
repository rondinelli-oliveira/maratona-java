package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Aula87DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Aula87DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Aula87FileLoader;

public class Aula87DataLoaderTest01 {
    public static void main(String[] args) {
        Aula87DatabaseLoader databaseLoader = new Aula87DatabaseLoader();
        Aula87FileLoader fileLoader = new Aula87FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        Aula87DataLoader.retrieveMaxDataSize();
        Aula87DatabaseLoader.retrieveMaxDataSize();
    }
}
