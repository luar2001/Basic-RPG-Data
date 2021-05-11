package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * object that represent a weapon for example Excalibur
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weapon {
    String name;
    double attackValue;
    WeaponType type;
}
