package academy.devdojo.maratonajava.introducao;

public class Aula34Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Seiya de Pégaso";
        nomes[1] = "Shiryu de Dragão";
        nomes[2] = "Ikki de Fênix";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
