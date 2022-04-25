package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Aula90Tomate extends Aula90Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;

    public Aula90Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
