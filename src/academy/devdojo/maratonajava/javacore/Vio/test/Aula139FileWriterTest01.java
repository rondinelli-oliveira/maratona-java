package academy.devdojo.maratonajava.javacore.Vio.test;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aula139FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ROR1021\\Documents\\ws-estudos\\maratona-java\\arquivo\\file.txt");
        try (FileWriter fileWriter = new FileWriter(file,true)) {
            fileWriter.write("Curso maratona-java do devdojo....\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
