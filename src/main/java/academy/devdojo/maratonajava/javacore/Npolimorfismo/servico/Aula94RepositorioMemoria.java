package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Aula94Repositorio;

public class Aula94RepositorioMemoria implements Aula94Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória....");
    }
}
