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
     * @param x integer
     * @param y integer
     * @return x/y
     */
    public int divide(int x, int y){
        return x/y;
    }

}
