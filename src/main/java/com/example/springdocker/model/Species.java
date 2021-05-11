package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * object that represent the fantasy Species like for example Dwarf or Elf
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Species {
    String species;
    double attackBonus;
}
