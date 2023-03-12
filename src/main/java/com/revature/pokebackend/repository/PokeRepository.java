package com.revature.pokebackend.repository;

import com.revature.pokebackend.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokeRepository extends JpaRepository<Pokemon, Long> {
}
