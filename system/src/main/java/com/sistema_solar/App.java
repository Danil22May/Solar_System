package com.sistema_solar;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Planet saturn = new Planet("Saturn", 24, 5.685, 82.713, 116460, 1400000000, true, Type.GASEOSO);
        System.out.println(saturn.getPlanetStats());
        System.out.println(saturn.isOutter());
        System.out.println(saturn.getDenstity());

        Planet neptune = new Planet("Neptune", 16, 1.024, 62, 49528, 480000000, false, Type.GASEOSO);
        System.out.println(neptune.getPlanetStats());
        System.out.println(neptune.isOutter());
        System.out.println(neptune.getDenstity());

    }
}
