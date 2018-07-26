package com.ORM.oneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/v1/klasses")
public class KlassController {
    KlassRepository repository;
    @Autowired
    public KlassController(KlassRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Klass save(@RequestBody Klass klass) {
        return  repository.save(klass);
    }

    @Transactional
    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Klass> findAll(){
        return repository.findAll();
    }

    @Transactional
    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Klass save(@PathVariable Long id) {
        Klass one=repository.findById(id).get();
        repository.delete(one);
        return one;
    }

    @Transactional
    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Klass save(@RequestBody Leader leader,@PathVariable Long id) {
        repository.findById(id).get().setLeader(leader);
        return  repository.findById(id).get();
    }

}
