package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aula70Professor {
    private String nome;
    private String especialidade;
    private Aula70Seminario[] seminarios;

    public Aula70Professor(String nome) {
        this.nome = nome;
    }

    public Aula70Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Aula70Professor(String nome, String especialidade, Aula70Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimeDados() {
        System.out.println("-----------------------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Aula70Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aula70Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno :" + aluno.getNome() + " idade: " + aluno.getIdade());
            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Aula70Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Aula70Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}