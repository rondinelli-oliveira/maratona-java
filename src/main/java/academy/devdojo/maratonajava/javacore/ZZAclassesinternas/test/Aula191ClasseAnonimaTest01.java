package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void andar() {
        System.out.println("Aninal está andando!!!");
    }
}
public class Aula191ClasseAnonimaTest01 {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            @Override
            public void andar() {
                System.out.println("Walking in the shadows!!!");;
            }
        };
        animal.andar();
    }
}
