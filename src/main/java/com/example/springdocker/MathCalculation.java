package com.example.springdocker;

/**
 * Created by Lukas Aronsson
 * Date: 12/05/2021
 * Time: 16:28
 * Project: spring-docker-demo
 * Copyright: MIT
 **/
public class MathCalculation {

    /**
     * adds x and y together and returns it.
     * @param x integer
     * @param y integer
     * @return x+y
     */
    public int add(int x, int y){
        return x+y;
    }

    /**
     * multiples x and y together and returns it.
     * @param x integer
     * @param y integer
     * @return x*y
     */
    public int multiply(int x, int y){
        return x*y;
    }

    /**
     * divide x and y and returns it.
     *
     * @param x double
     * @param y double
     * @return x/y double
     * @throws IllegalArgumentException if any parameter is 0
     */
    public double divide(double x, double y) {
        if (x == 0 & y == 0 || x == 0 || y == 0) {
            throw new IllegalArgumentException("Can't divide by 0");
        } else {
            return x / y;
        }


    }

}
