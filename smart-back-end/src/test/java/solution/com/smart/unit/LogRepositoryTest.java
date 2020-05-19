package solution.com.smart.unit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import solution.com.smart.domain.Log;
import solution.com.smart.repository.LogRepository;

import java.util.Date;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LogRepositoryTest {

    @Autowired
    private LogRepository logRepository;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createShouldPersistData() {

        Log log = new Log(new Long(0),
                new Date(),
                "GET",
                "S",
                "deyveson");

        this.logRepository.save(log);

        assertThat(log.getId()).isNotNull();
        assertThat(new Date());
        assertThat(log.getRequest()).isEqualTo("GET");
        assertThat(log.getStatus()).isEqualTo("S");
        assertThat(log.getUser_agente()).isEqualTo("deyveson");

    }

    @Test
    public void updateShouldChangeAndPersistData() {

        Log log = new Log(new Long(2),
                new Date(),
                "GET",
                "S",
                "deyveson");

        logRepository.save(log);

        log.setRequest("POST");
        log.setStatus("A");
        log.setUser_agente("willian");

        log = logRepository.save(log);

        assertThat(log.getRequest()).isEqualTo("POST");
        assertThat(log.getStatus()).isEqualTo("A");
        assertThat(log.getUser_agente()).isEqualTo("willian");

    }

    @Test
    public void deleteShouldRemoveData() {

        Log log = new Log(new Long(1),
                new Date(),
                "PUT",
                "F",
                "willian");

        logRepository.save(log);

        logRepository.delete(log);

        assertThat(logRepository.existsById(log.getId())).isFalse();

    }
}
