package academy.devdojo.maratonajava.introducao;

public class Aula10TiposPrimitivos {
    public static void main(String[] args) {
        //Tipos primitivos são os que armazenam em memória valores mais simples
        //int, double, float, char, byte, short, long, boolean
        //por convenção as variáveis devem ser iniciadas com letra minúscula e se for composta
        //a segunda palavras começa com letra maiúscula
        int idade = (int)1000000000L;
        long numeroGrande = 100000L;
        double salarioDoule = 2000.0;
        float salarioFloat = (float) 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 82;


        System.out.println(idade);
        System.out.println(verdadeiro);
        System.out.println(caractere);
    }
}
