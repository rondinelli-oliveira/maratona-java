package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Aula58Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Aula58Anime(String nome, String tipo, int episodios, String genero) {
        this();
        System.out.println("Dentor do construtor com argumentos!");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Aula58Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        System.out.println("Dentor do construtor com argumentos 2!");
        this.estudio = estudio;
    }

    public Aula58Anime() {
        System.out.println("Dentro do construtor sem argumentos!");
    }

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
