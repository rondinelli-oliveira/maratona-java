package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula271Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.Aula271ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class Aula271ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Aula271Producer> producers = Aula271ProducerService.findByNameJdbcRowSet("Rondinelli413");
        log.info("Producers found: '{}'.", producers);
    }
}
