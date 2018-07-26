package com.ORM.oneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RequestMapping("/api/v1/leaders")
@RestController
public class LeaderController {
    LeaderRepository repository;

    @Autowired
    public LeaderController(LeaderRepository repository){this.repository=repository;}

    @Transactional
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Leader save(@RequestBody Leader leader) {
        return  repository.save(leader);
    }

    @Transactional
    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Leader> findAll(){
        return repository.findAll();
    }
}
