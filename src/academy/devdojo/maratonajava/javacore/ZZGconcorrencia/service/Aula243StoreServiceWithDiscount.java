package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Aula243Discount;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Aula243Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Aula243StoreServiceWithDiscount {
    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Aula243Discount.Code discountCode = Aula243Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Aula243Discount.Code.values().length)
                ];
        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }

    public String applyDiscount(Aula243Quote quote) {
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountValue);
    }

    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
