package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.Aula257ProducerRepository;

import java.util.List;

public class Aula259ProducerService {

    public static void save(Aula257Producer producer) {
        Aula257ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        Aula257ProducerRepository.delete(id);
    }

    public static void update(Aula257Producer producer) {
        requireValidId(producer.getId());
        Aula257ProducerRepository.update(producer);
    }

    public static List<Aula257Producer> findAll() {
        return Aula257ProducerRepository.findAll();
    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id!");
        }
    }
}
