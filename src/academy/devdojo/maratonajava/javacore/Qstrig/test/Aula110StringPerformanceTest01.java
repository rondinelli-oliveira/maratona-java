package academy.devdojo.maratonajava.javacore.Qstrig.test;

public class Aula110StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1_000);
        long fim = System.currentTimeMillis();
        System.out.println("O tempo gasto para string: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(10_000_000);
        fim = System.currentTimeMillis();
        System.out.println("O tempo gasto para stringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(10_000_000);
        fim = System.currentTimeMillis();
        System.out.println("O tempo gasto para stringBuffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
