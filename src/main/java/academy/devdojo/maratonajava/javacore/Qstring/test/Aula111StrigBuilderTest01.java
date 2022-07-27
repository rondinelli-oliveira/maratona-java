package academy.devdojo.maratonajava.javacore.Qstring.test;

public class Aula111StrigBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Rondinelli Oliveira";
        nome.concat(" Evolution Company Technology");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Rondinelli Oliveira");
        sb.append(" Evolution").append(" Company").append(" Technology");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
