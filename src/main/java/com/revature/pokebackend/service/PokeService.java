package com.revature.pokebackend.service;

import com.revature.pokebackend.entity.Pokemon;

import java.util.List;

public interface PokeService {
    Pokemon insert(Pokemon pokemon);
    Pokemon getById(Long id);
    List<Pokemon> getAll();
    Pokemon update(Pokemon pokemon);
    boolean delete(Long id);
}
