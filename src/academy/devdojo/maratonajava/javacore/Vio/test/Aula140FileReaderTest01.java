package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Aula140FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ROR1021\\Documents\\ws-estudos\\maratona-java\\arquivo\\file.txt");
        try (FileReader fileReader = new FileReader(file)) {
//            char[] in = new char[30];
//            fileReader.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
