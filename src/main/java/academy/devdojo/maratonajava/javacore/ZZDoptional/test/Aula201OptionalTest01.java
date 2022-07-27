package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class Aula201OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Teste");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-------------------------");
        Optional<String> nomeOptional = buscarNome("Rondinelli");
        String empty = nomeOptional.orElse("EMPTY");
        System.out.println(empty);
        nomeOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> buscarNome(String nome) {
        List<String> list = List.of("Rondinelli", "Flávia");
        int i = list.indexOf(nome);
        if (i != 1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
