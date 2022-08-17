package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.Aula259ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class Aula256ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Aula257Producer producer = Aula257Producer
                .builder()
                .name("Rondinelli413")
                .build();
        Aula257Producer producerToUpdate = Aula257Producer
                .builder()
                .id(1)
                .name("Rondinelli413")
                .build();
//        Aula259ProducerService.save(producer);
//        Aula259ProducerService.delete(5);
//        Aula259ProducerService.update(producerToUpdate);
//        List<Aula257Producer> producers = Aula259ProducerService.findAll();
//        log.info("Producers found: '{}'.", producers.size());
//        List<Aula257Producer> producers = Aula259ProducerService.findByName("R");
//        log.info("Producers found: '{}'.", producers);
//        Aula259ProducerService.showProducerMetaData();
//        Aula259ProducerService.showDriverMetaData();
//        Aula259ProducerService.showTypeScrollWorking();
//        List<Aula257Producer> producers = Aula259ProducerService.findByNameAndUpdateByToUpperCase("Ron");
//        log.info("Producers found: '{}'.", producers);
//        List<Aula257Producer> producers = Aula259ProducerService.findByNameAndInsertWhenNotFound("Felipe");
//        log.info("Producers found: '{}'.", producers);
//        Aula259ProducerService.findByNameAndDelete("Felipe");
        List<Aula257Producer> producers = Aula259ProducerService.findByNamePreparedStatement("Ro");
        log.info("Producers found: '{}'.", producers);
    }
}
