package academy.devdojo.maratonajava.introducao;

public class Aula35Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}

