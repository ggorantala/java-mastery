package dev.ggorantala.streamsapi.streamsapi.functionalprogramming.functions.impure;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println(generateRandomNumber());
    }

    public static double generateRandomNumber() {
        return Math.random();
    }
}
