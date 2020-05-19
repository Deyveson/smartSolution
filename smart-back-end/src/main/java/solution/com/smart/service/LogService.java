package solution.com.smart.service;

import solution.com.smart.domain.Log;

import java.util.List;
import java.util.Optional;

public interface LogService {

    Log createLog(Log log);

    List<Log> allLogs();

    Optional<Log> searchByID(Long id);

    void deleteLog(Long id);
}
