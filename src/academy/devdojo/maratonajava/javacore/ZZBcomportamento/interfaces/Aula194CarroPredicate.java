package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Aula193Carro;

@FunctionalInterface
public interface Aula194CarroPredicate {
    // anonimas, funções, conciso
    boolean test(Aula193Carro carro);
    //(parametro) -> <expressão>
    //(Car car) -> car.getColor().equals("green");
}
