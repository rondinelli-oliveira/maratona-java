package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class Aula106WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'R';
        boolean booleanP = false;

        Byte byteR = 1;
        Short shortR = 1;
        Integer intR = 1; //autoboxing
        Long longR = 10L;
        Float floatR = 10F;
        Double doubleR = 10D;
        Character charR = 'R';
        Boolean booleanR = false;

        int i = intR; //unboxing
        Integer intR2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean(null);
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
