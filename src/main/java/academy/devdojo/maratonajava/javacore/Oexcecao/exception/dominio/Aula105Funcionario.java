package academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio;

import java.io.FileNotFoundException;

public class Aula105Funcionario extends Aula105Pessoa {
    public void salvar() throws Aula104LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionário....");
    }
}
