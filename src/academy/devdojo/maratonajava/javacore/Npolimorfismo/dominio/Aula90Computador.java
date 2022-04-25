package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Aula90Computador extends Aula90Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Aula90Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
