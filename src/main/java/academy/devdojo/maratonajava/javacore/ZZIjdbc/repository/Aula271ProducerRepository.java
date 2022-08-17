package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.Aula271ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula257Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Aula271Producer;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class Aula271ProducerRepository {

    public static List<Aula271Producer> findByNameJdbcRowSet(String name) {
        log.info("Listing producer(s) by name.");
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Aula271Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = Aula271ConnectionFactory.getJdbcRowSet()) {
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
            log.error("Fail while trying to find producer.",e);
        }
        return producers;
    }
}
