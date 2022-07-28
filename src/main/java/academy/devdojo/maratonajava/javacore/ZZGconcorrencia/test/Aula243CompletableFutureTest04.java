package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Aula243Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.Aula243StoreServiceWithDiscount;

import java.util.List;

public class Aula243CompletableFutureTest04 {
    public static void main(String[] args) {
        Aula243StoreServiceWithDiscount service = new Aula243StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(Aula243StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync) //store:price:code
                .map(Aula243Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
