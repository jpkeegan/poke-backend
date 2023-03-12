package com.revature.pokebackend.service;

import com.revature.pokebackend.entity.Pokemon;
import com.revature.pokebackend.repository.PokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokeService{

    @Autowired
    PokeRepository pokeRepository;

    @Override
    public Pokemon insert(Pokemon pokemon){
        return pokeRepository.save(pokemon);
    }

    @Override
    public Pokemon getById(Long id) {
        return pokeRepository.findById(id).get();
    }

    @Override
    public List<Pokemon> getAll() {
        return pokeRepository.findAll();
    }

    @Override
    public Pokemon update(Pokemon pokemon) {
        return pokeRepository.save(pokemon);
    }

    @Override
    public boolean delete(Long id) {
        boolean found = pokeRepository.existsById(id);
        pokeRepository.deleteById(id);
        return found;
    }
}
