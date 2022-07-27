package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Aula94Repositorio;

public class Aula94RepositorioBancoDeDados implements Aula94Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados....");
    }
}
