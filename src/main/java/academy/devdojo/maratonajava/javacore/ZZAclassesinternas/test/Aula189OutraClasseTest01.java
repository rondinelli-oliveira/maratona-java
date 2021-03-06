package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class Aula189OutraClasseTest01 {
    private String nome = "Rondinelli";

    class ClasseInterna {
        public void imprimeOutraClasseAtributo() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(Aula189OutraClasseTest01.this);
        }
    }

    public static void main(String[] args) {
        Aula189OutraClasseTest01 outerClass = new Aula189OutraClasseTest01();
        ClasseInterna classeInterna = outerClass.new ClasseInterna();
        ClasseInterna classeInterna1 = new Aula189OutraClasseTest01().new ClasseInterna();
        classeInterna.imprimeOutraClasseAtributo();
        classeInterna1.imprimeOutraClasseAtributo();
    }
}
