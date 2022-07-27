package academy.devdojo.maratonajava.javacore.Oexcecao.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.Aula104LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.Aula105Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.Aula105Pessoa;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Aula105SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Aula105Pessoa pessoa = new Aula105Pessoa();
        Aula105Funcionario funcionario = new Aula105Funcionario();

        try {
            pessoa.salvar();
        } catch (Aula104LoginInvalidoException | IOException e) {
            e.printStackTrace();
        }

        try {
            funcionario.salvar();
        } catch (Aula104LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
