package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Aula116NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeJapao = Locale.JAPAN;
        Locale localeItalia = Locale.ITALY;
        Locale localeEstadosUnidos = Locale.US;
        NumberFormat[] numberFormats = new NumberFormat[5];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeBrasil);
        numberFormats[2] = NumberFormat.getInstance(localeJapao);
        numberFormats[3] = NumberFormat.getInstance(localeItalia);
        numberFormats[4] = NumberFormat.getInstance(localeEstadosUnidos);
        double valor = 100_000_000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";
        try {
            System.out.println(numberFormats[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
