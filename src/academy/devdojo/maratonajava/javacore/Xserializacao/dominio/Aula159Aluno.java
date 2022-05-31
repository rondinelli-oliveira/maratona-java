package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aula159Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -4429467222130701126L;

    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo - maratona-java";
    private transient Aula160Turma turma;

    public Aula159Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do construtor.");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Aula160Turma getTurma() {
        return turma;
    }

    public void setTurma(Aula160Turma turma) {
        this.turma = turma;
    }

    @Serial
    private void writeObject(ObjectOutputStream outputStream) {
        try {
            outputStream.defaultWriteObject();
            outputStream.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream inputStream) {
        try {
            inputStream.defaultReadObject();
            String nomeTurma = inputStream.readUTF();
            turma = new Aula160Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aula159Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }
}
