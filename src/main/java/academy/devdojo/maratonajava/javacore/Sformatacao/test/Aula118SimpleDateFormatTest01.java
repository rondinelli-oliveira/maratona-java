package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula118SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Uberlândia,' dd 'de' MMMM 'de' yyyy'.'";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("Uberlândia, 27 de Abril de 2022."));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
