package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.Aula257ProducerRepository;

public class Aula256ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Aula257Producer producer = Aula257Producer.Aula257ProducerBuilder
                .builder()
                .name("Aula256Producer")
                .build();
        Aula257ProducerRepository.save(producer);
    }
}