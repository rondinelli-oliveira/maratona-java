package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class Aula251DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aula248Aircraft aircraft = new Aula248Aircraft("777");
        Aula247Country country = Aula247Country.BRAZIL;
        Aula247Currency currency = Aula247CurrencyFactory.newCurrency(country);
        Aula246Person person = Aula246Person.Aula246PersonBuilder
                .builder()
                .firstName("Rondinelli")
                .lastName("Oliveira")
                .build();
        Aula251ReportDto reportDto = Aula251ReportDto.Aula251ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
