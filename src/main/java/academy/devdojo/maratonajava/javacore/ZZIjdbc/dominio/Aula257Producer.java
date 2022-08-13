package academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio;

import java.util.Objects;

public class Aula257Producer {
    private Integer id;
    private String name;

    public static final class Aula257ProducerBuilder {
        private Integer id;
        private String name;

        private Aula257ProducerBuilder() {
        }

        public static Aula257ProducerBuilder builder() {
            return new Aula257ProducerBuilder();
        }

        public Aula257ProducerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public Aula257ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Aula257Producer build() {
            Aula257Producer aula257Producer = new Aula257Producer();
            aula257Producer.name = this.name;
            aula257Producer.id = this.id;
            return aula257Producer;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula257Producer that = (Aula257Producer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
