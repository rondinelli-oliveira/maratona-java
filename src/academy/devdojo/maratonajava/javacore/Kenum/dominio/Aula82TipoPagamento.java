package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum Aula82TipoPagamento {
    DEBITO {
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calculaDesconto(double valor);
}