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
    String name;
    int age;
    String gender;
    Species species;
    int level;
    Class rpgClass;
    double attack;
    double max_health;
    double current_health;
    Weapon weapon;
    Food favoriteFood;
}

