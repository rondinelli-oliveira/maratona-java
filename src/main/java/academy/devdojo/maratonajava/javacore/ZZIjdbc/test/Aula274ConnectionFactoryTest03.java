package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.Aula259ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class Aula274ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Aula257Producer producer1 = Aula257Producer.builder().name("Rondinelli").build();
        Aula257Producer producer2 = Aula257Producer.builder().name("Flávia").build();
        Aula257Producer producer3 = Aula257Producer.builder().name("Gabriel").build();
        Aula259ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
//        log.info("----------------------------------------------------");
//        List<Aula271Producer> producers = Aula271ProducerService.findByNameJdbcRowSet("");
//        log.info("Producers found: '{}'.", producers);

    }
}
