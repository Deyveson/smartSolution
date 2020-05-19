package solution.com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import solution.com.smart.domain.Log;
import solution.com.smart.service.LogService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/log")
public class LogController {

    @Autowired
    LogService logService;

    @CrossOrigin
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Log registerLog(@RequestBody Log log) {

        return logService.createLog(log);
    }

    @CrossOrigin
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Log> allLogs() {

        return logService.allLogs();
    }

    @CrossOrigin
    @PutMapping(path = "/{id}")
    public Optional<Log> searchLog(@RequestParam Long id) {

        return logService.searchByID(id);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deleteLog(@PathVariable("id") Long id){
        logService.deleteLog(id);
    }
}

