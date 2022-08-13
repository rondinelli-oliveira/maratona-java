package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.Aula259ProducerService;

public class Aula256ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Aula257Producer producer = Aula257Producer
                .builder()
                .name("Rondinelli413")
                .build();Aula257Producer producerToUpdate = Aula257Producer
                .builder()
                .id(1)
                .name("Rondinelli413")
                .build();
//        Aula259ProducerService.save(producer);
//        Aula259ProducerService.delete(5);
        Aula259ProducerService.update(producerToUpdate);
    }
}
