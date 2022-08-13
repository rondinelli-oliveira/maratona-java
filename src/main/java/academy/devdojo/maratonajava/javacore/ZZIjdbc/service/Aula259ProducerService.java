package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.Aula257ProducerRepository;

public class Aula259ProducerService {

    public static void save(Aula257Producer producer) {
        Aula257ProducerRepository.save(producer);
    }

    public static void delete(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid value for id!");
        }
        Aula257ProducerRepository.delete(id);
    }
}
