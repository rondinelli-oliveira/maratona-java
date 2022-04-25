package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Aula94Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.Aula94RepositorioArquivo;

import java.util.LinkedList;
import java.util.List;

public class Aula94repositorioTeste {
    public static void main(String[] args) {
        Aula94Repositorio repositorio = new Aula94RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Rondinelli");
        list.add("Flávia");
        list.add("Gabriel");
        list.add("Felipe");
        System.out.println(list);
    }
}
