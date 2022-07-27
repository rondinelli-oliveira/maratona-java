package academy.devdojo.maratonajava.introducao;

public class Aula27EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador += 1;
        }
        contador = 0;
        do {
            System.out.println("Dentro do do-while " + ++contador);
        } while (contador < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("For " + i);
        }
    }
}
