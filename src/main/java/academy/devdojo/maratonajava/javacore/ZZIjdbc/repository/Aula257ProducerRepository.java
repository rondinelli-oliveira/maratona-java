package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.Aula255ConectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class Aula257ProducerRepository {
    public static void save(Aula257Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = Aula255ConectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in database, row(s) affected '{}'.", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Failed to insert producer '{}' in database.", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = Aula255ConectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer with id: '{}' from database, row(s) affected '{}'.", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Failed to delete producer '{}' in database.", id, e);
        }
    }

    public static void update(Aula257Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = Aula255ConectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer with id: '{}', row(s) affected '{}'.", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Failed to update producer '{}' in database.", producer.getId(), e);
        }
    }

    public static List<Aula257Producer> findAll() {
        log.info("Listing all producers.");
        String sql = "SELECT id, name FROM `anime_store`.`producer`;";
        List<Aula257Producer> producers = new ArrayList<>();
        try (Connection conn = Aula255ConectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
//                var id = rs.getInt("id");
//                var name = rs.getString("name");
                Aula257Producer producer = Aula257Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Failed while trying to find all update producers.");
        }
        return producers;
    }
}
