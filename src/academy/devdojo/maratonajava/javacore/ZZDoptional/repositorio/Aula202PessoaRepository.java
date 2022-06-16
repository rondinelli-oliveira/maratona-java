package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Aula202Pessoa;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Aula202PessoaRepository {
    private static List<Aula202Pessoa> pessoas = List.of(new Aula202Pessoa(1, "Rondinelli", 37),
            new Aula202Pessoa(2, "Flávia", 38));

    public static Optional<Aula202Pessoa> buscarPorId(Integer id) {
        return buscarPor(pessoa -> pessoa.getId().equals(id));
    }

    public static Optional<Aula202Pessoa> buscarPorNome(String nome) {
        return buscarPor(pessoa -> pessoa.getNome().equals(nome));
    }

    private static Optional<Aula202Pessoa> buscarPor(Predicate<Aula202Pessoa> pessoaPredicate) {
        Aula202Pessoa encontrado = null;
        for (Aula202Pessoa pessoa : pessoas) {
            if (pessoaPredicate.test(pessoa)) {
                encontrado = pessoa;
            }
        }
        return Optional.ofNullable(encontrado);
    }
}
