package academy.devdojo.maratonajava.javacore.ZZClambidas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

//Referência a um método de instância de um objeto arbitrário de um tipo específico
//Reference to an instance method of an arbitrary object of a particular type
public class Aula199MephodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rondinelli", "Flavia", "Gabriel", "Felipe"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numeroStrigParaInteger = Integer::parseInt;
        Integer apply = numeroStrigParaInteger.apply("10");
        System.out.println(apply);

        BiPredicate<List<String>,String> checaNome = List::contains;
        System.out.println(checaNome.test(list, "Rondinelli"));
    }
}
