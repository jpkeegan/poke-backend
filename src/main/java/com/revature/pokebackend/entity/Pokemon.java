package com.revature.pokebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type1;
    private String type2 = null;
    private String sprite;

    public Pokemon(String name, String type1, String type2, String sprite) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.sprite = sprite;
    }
}
