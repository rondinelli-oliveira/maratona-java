package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class Aula246Person {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    private Aula246Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static final class Aula246PersonBuilder {

        private String firstName;
        private String lastName;
        private String username;
        private String email;

        private Aula246PersonBuilder() {
        }

        public static Aula246PersonBuilder builder() {
            return new Aula246PersonBuilder();
        }

        public Aula246PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Aula246PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Aula246PersonBuilder username(String username) {
            this.username = username;
            return this;
        }

        public Aula246PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Aula246Person build() {
            return new Aula246Person(firstName, lastName, username, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }
}