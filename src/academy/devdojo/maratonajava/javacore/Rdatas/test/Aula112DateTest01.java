package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class Aula112DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.toString());
        System.out.println(date.after(date));
        System.out.println(date.before(date));
        System.out.println(date.toInstant());
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
