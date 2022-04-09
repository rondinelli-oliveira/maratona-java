package academy.devdojo.maratonajava.introducao;

public class Aula30EstruturasDeRepeticaoExercicio {
    //Dado valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição valor da parcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + parcela + " R$" + valorParcela);
        }
    }
}
