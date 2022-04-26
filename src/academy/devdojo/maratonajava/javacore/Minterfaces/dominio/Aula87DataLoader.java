package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface Aula87DataLoader {
    int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface....");
    }
}
