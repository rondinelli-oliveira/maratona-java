package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>
confirmo que recebi o salário de <salario> na data <data>
 */
public class Aula14TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Seya";
        String endereco = "Rua Sem Nome número 100";
        double salario = 3000.0;
        String dataRecebimento = "01/01/2022";

        String relatorio = "Eu " + nome +
                " morando no endereço: " + endereco + "," +
                " confirmo que recebi o salário de: " + salario + "," +
                " na data: " + dataRecebimento + ".";

        System.out.println(relatorio);
    }
}
