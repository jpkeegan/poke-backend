package com.revature.pokebackend.controller;

import com.revature.pokebackend.entity.Pokemon;
import com.revature.pokebackend.service.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PokeController {

    @Autowired
    PokeService pokeService;

    @PostMapping("/pokemon")
    public Pokemon insert(@RequestBody Pokemon pokemon){
        return pokeService.insert(pokemon);
    }

    @RequestMapping(value = "/pokemon", method = RequestMethod.GET)
    public List<Pokemon> getAll() {return pokeService.getAll();}

    @GetMapping("pokemon/{id}")
    public Pokemon getById(@PathVariable("id") Long id){ return pokeService.getById(id);}

    @PutMapping("pokemon/{id}")
    public Pokemon update(@RequestBody Pokemon pokemon) {return pokeService.update(pokemon);}

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") Long id){
        return pokeService.delete(id);
    }

    @RequestMapping(method = RequestMethod.OPTIONS, value = "*")
    public String optionsreturn() {
        return "";
    }
}
