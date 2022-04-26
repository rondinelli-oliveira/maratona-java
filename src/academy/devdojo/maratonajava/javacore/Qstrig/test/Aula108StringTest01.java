package academy.devdojo.maratonajava.javacore.Qstrig.test;

public class Aula108StringTest01 {
    public static void main(String[] args) {
        String nome = "Rondinelli"; //String constant pool
        String nome2 = "Rondinelli";
        nome = nome.concat(" Oliveira"); //nome += " Oliveira"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Rondinelli"); //1 variável de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
