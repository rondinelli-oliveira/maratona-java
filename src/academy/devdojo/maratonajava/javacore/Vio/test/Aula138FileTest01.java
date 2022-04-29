package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Aula138FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ROR1021\\Documents\\ws-estudos\\maratona-java\\arquivo\\file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado com sucesso: " + isCreated);
            System.out.println("File created successfull: " + isCreated);
            System.out.println("Caminho: " + file.getPath());
            System.out.println("Path: " + file.getPath());
            System.out.println("Caminho absoluto(Path absolute): " + file.getAbsolutePath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("É um diretótio: " + file.isDirectory());
            System.out.println("It's a directory: " + file.isDirectory());
            System.out.println("É um arquivo(is file): " + file.isFile());
            System.out.println("It's a file: " + file.isFile());
            System.out.println("É um arquivo oculto: " + file.isHidden());
            System.out.println("It's a hidden file: " + file.isHidden());
            ZonedDateTime lastModified = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault());
            System.out.println("Última modificação: " + lastModified);
            System.out.println("Last modification: " + lastModified);
            boolean exists = file.exists();
            if (exists) {
                file.delete();
                System.out.println("Arquivo excluído com sucesso.");
                System.out.println("File successfull deleted.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
