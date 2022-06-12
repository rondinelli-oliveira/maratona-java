package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class Aula190OutraClasseTest02 {

    private String nome = "Rondinelli";

    void imprime() {
        final String ultimoNome = "Silva";

        class ClasseLocal {
            public void imprimeLocal() {
                System.out.println(nome + " " + ultimoNome);
            }
        }
        ClasseLocal classeLocal = new ClasseLocal();
        classeLocal.imprimeLocal();
    }

    public static void main(String[] args) {
        Aula190OutraClasseTest02 classeTest02 = new Aula190OutraClasseTest02();
        classeTest02.imprime();
    }
}
