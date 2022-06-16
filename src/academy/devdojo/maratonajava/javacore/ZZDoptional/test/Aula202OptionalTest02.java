package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Aula202Pessoa;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.Aula202PessoaRepository;

import java.util.Optional;

public class Aula202OptionalTest02 {
    public static void main(String[] args) {
        Optional<Aula202Pessoa> porNome = Aula202PessoaRepository.buscarPorNome("Rondinelli");
        System.out.println(porNome);
        porNome.ifPresent(pessoa -> pessoa.setNome("Rondinelli Oliveira"));
        System.out.println(porNome);

        Aula202Pessoa pessoaPorId = Aula202PessoaRepository.buscarPorId(2)
                .orElseThrow(IllegalAccessError::new);

        System.out.println(pessoaPorId);

        Aula202Pessoa novaPessoa = Aula202PessoaRepository.buscarPorNome("Gabriel")
                .orElseGet(() -> new Aula202Pessoa(3, "Gabriel", 13));
        System.out.println(novaPessoa);
    }
}
