package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula271Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.Aula271ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class Aula271ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Aula271Producer producerToUpdate = Aula271Producer
                .builder()
                .id(1)
                .name("RONDINELLI413")
                .build();
        Aula271ProducerService.updateJdbcRowSet(producerToUpdate);
        log.info("----------------------------------------------------");
        List<Aula271Producer> producers = Aula271ProducerService.findByNameJdbcRowSet("");
        log.info("Producers found: '{}'.", producers);

    }
}
