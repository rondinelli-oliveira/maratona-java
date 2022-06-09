package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Aula179Consumidor {
    private Long id;
    private String nome;

    public Aula179Consumidor(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula179Consumidor that = (Aula179Consumidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Aula179Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
