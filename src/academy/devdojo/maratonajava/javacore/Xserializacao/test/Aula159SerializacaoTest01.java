package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aula159Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aula160Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aula159SerializacaoTest01 {
    public static void main(String[] args) {
        Aula159Aluno aluno = new Aula159Aluno(1L, "Rondinelli", "123456");
        Aula160Turma turma = new Aula160Turma("Maratona java em breve rico.");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();

    }

    private static void serializar(Aula159Aluno aluno) {
        Path path = Paths.get("pasta/aluno.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            outputStream.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.txt");
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Aula159Aluno aluno = (Aula159Aluno)inputStream.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
