package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Aula92Televisao extends Aula90Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Aula92Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
