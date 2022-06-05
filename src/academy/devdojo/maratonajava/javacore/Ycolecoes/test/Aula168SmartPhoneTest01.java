package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Aula161Smartphone;

import java.util.ArrayList;
import java.util.List;

public class Aula168SmartPhoneTest01 {
    public static void main(String[] args) {
        Aula161Smartphone smartphone1 = new Aula161Smartphone("1ABC1", "iPhone");
        Aula161Smartphone smartphone2 = new Aula161Smartphone("22222", "Sansung");
        Aula161Smartphone smartphone3 = new Aula161Smartphone("33333", "Xaomi");
        Aula161Smartphone smartphone4 = new Aula161Smartphone("44444", "Motorola");
        List<Aula161Smartphone> smartphones = new ArrayList<>();
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);
        smartphones.add(smartphone4);

        for (Aula161Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

        Aula161Smartphone smartphone5 = new Aula161Smartphone("44444", "Motorola");
        System.out.println(smartphone5.equals(smartphone4));
        System.out.println(smartphones.contains(smartphone5));

        int index = smartphones.indexOf(smartphone5);
        System.out.println(index);

        System.out.println(smartphones.get(index));
    }
}
