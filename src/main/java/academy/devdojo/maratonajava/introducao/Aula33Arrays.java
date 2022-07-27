package academy.devdojo.maratonajava.introducao;

public class Aula33Arrays {
    public static void main(String[] args) {
        //byte, short, int, long, float e double são inicializados com 0
        //char '\u0000' unicode representando um espaço
        //boolean false
        //String ou outro null

        byte[] bytes = new byte[1];
        System.out.println("byte " + bytes[0]);

        short[] shorts = new short[1];
        System.out.println("shorts " + shorts[0]);

        int[] idades = new int[1];
        System.out.println("int " + idades[0]);

        long[] longs = new long[1];
        System.out.println("long " + longs[0]);

        float[] floats = new float[1];
        System.out.println("float " + floats[0]);

        double[] doubles = new double[1];
        System.out.println("double " + doubles[0]);

        char[] chars = new char[1];
        System.out.println("char " + chars[0]);

        boolean[] booleans = new boolean[1];
        System.out.println("boolean " + booleans[0]);

        String[] strings = new String[1];
        System.out.println("String " + strings[0]);
    }
}
