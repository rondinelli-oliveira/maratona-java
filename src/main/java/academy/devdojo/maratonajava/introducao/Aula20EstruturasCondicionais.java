package academy.devdojo.maratonajava.introducao;

public class Aula20EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (idade >= 18) {
            System.out.println("Autorizado a comprar bebida alcóolica.");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcóolica.");
        }

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcóolica.");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcóolica.");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcóolica.");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcóolica.");
        }
    }

}
