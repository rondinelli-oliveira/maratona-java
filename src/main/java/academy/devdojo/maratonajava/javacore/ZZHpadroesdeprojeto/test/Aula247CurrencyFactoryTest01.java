package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aula247Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aula247Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aula247CurrencyFactory;

public class Aula247CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Aula247Currency currency = Aula247CurrencyFactory.newCurrency(Aula247Country.BRAZIL);
        System.out.println(currency.getSymbol());

        Aula247Currency currency1 = Aula247CurrencyFactory.newCurrency(Aula247Country.USA);
        System.out.println(currency1.getSymbol());
    }
}
