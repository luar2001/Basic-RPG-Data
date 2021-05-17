package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * object that represent an rpg character like for example Gandalf the gray
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {
    String id;
    String name;
    int age;
    String gender;
    Species species;
    int level;
    double attack;
    double maxHealth;
    double currentHealth;
    Weapon weapon;
    Food favoriteFood;
}

