package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.Aula255ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Aula257ProducerRepository {
    public static void save(Aula257Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = Aula255ConectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
