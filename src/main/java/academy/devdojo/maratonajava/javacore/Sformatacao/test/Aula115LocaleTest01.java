package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Aula115LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Locale localeEstadosUnidos = new Locale("en", "US");
        Locale localeBrasil = new Locale("pt", "BR");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dateFormat5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat dateFormat6 = DateFormat.getDateInstance(DateFormat.FULL, localeEstadosUnidos);
        DateFormat dateFormat7 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);

        System.out.println("Horário " + localeItaly.getDisplayCountry() + ": " + dateFormat1.format(calendar.getTime()));
        System.out.println("Horário " + localeSuica.getDisplayCountry() + ": " + dateFormat2.format(calendar.getTime()));
        System.out.println("Horário " + localeIndia.getDisplayCountry() + ": " + dateFormat3.format(calendar.getTime()));
        System.out.println("Horário " + localeJapao.getDisplayCountry() + ": " + dateFormat4.format(calendar.getTime()));
        System.out.println("Horário " + localeHolanda.getDisplayCountry() + ": " + dateFormat5.format(calendar.getTime()));
        System.out.println("Horário " + localeEstadosUnidos.getDisplayCountry() + ": " + dateFormat6.format(calendar.getTime()));
        System.out.println("Horário " + localeBrasil.getDisplayCountry() + ": " + dateFormat7.format(calendar.getTime()));
    }
}
