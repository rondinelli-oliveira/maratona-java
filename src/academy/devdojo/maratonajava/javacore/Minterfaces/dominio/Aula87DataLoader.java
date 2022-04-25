package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface Aula87DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
