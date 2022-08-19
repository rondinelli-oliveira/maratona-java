package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.Aula255ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.Aula271ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula271Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.listener.Aula272CustomRowSetListener;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Log4j2
public class Aula271ProducerRepository {

    public static List<Aula271Producer> findByNameJdbcRowSet(String name) {
        log.info("Listing producer(s) by name.");
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        List<Aula271Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = Aula271ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new Aula272CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while (jrs.next()) {
                Aula271Producer producer = Aula271Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Fail while trying to find producer.", e);
        }
        return producers;
    }

//    public static void updateJdbcRowSet(Aula271Producer producer) {
//        log.info("Updating producer(s).");
//        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
//        try (JdbcRowSet jrs = Aula271ConnectionFactory.getJdbcRowSet()) {
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(2, producer.getId());
//            jrs.execute();
//        } catch (SQLException e) {
//            log.error("Fail while trying to update producer.", e);
//        }
//    }

    public static void updateJdbcRowSet(Aula271Producer producer) {
        log.info("Updating producer(s).");
        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?);";
        try (JdbcRowSet jrs = Aula271ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new Aula272CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            log.error("Fail while trying to update producer.", e);
        }
    }

    public static void updateCachedRowSet(Aula271Producer producer) {
        log.info("Updating producer(s).");
        String sql = "SELECT * FROM producer WHERE (`id` = ?);";
        try (CachedRowSet crs = Aula271ConnectionFactory.getCachedRowSet();
             Connection connection = Aula255ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);
            if (!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
            TimeUnit.SECONDS.sleep(10);
            crs.acceptChanges();
        } catch (SQLException | InterruptedException e) {
            log.error("Fail while trying to update producer.", e);
        }
    }
}
