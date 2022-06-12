package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class Aula192OutraClasseTest03 {
    private String nome = "Rondinelli";

    static class Aninhada {
        private String ultimoNome = "Silva";

        void imprime() {
            System.out.println(new Aula192OutraClasseTest03().nome + " " + ultimoNome);
        }
    }

    public static void main(String[] args) {
        Aninhada aninhada = new Aninhada();
        aninhada.imprime();
    }
}
