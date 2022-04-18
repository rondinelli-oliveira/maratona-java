package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aula66Escola {
    private String nome;
    private Aula66Professor[] professores;

    public Aula66Escola(String nome) {
        this.nome = nome;
    }

    public Aula66Escola(String nome, Aula66Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimeDados() {
        System.out.println(this.nome);
        for (Aula66Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula66Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Aula66Professor[] professores) {
        this.professores = professores;
    }
}
