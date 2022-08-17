package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula271Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.Aula271ProducerRepository;

import java.util.List;

public class Aula271ProducerService {


    public static List<Aula271Producer> findByNameJdbcRowSet(String name) {
        return Aula271ProducerRepository.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Aula271Producer producer) {
        Aula271ProducerRepository.updateJdbcRowSet(producer);
    }
}
