package solution.com.smart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solution.com.smart.domain.Log;
import solution.com.smart.repository.LogRepository;
import solution.com.smart.service.LogService;

import java.util.List;
import java.util.Optional;

@Service("LogService")
public class LogServiceImpl implements LogService {

    @Autowired
    LogRepository logRepository;

    @Override
    public Log createLog(Log log){
        return logRepository.save(log);
    }

    @Override
    public List<Log> allLogs(){
        return logRepository.findAll();
    }

    @Override
    public Optional<Log> searchByID(Long id){
        return logRepository.findById(id);
    }

    @Override
    public void deleteLog(Long id){
        logRepository.deleteById(id);
    }

}
