package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Aula63Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicializacao estático 1.");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 2.");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 3.");
    }

    {
        System.out.println("Dentro do bloco de inicializacao.");
    }

    public Aula63Anime(String nome) {
        this.nome = nome;
    }

    public Aula63Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
