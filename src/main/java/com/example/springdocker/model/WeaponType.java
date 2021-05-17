package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *Object that represent the type of weapon for example a sword
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeaponType {
    String id;
    String type;
}
