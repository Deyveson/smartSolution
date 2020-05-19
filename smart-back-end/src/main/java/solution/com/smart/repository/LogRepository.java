package solution.com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solution.com.smart.domain.Log;

public interface LogRepository extends JpaRepository<Log, Long> {

}
