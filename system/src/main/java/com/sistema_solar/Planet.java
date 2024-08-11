package com.sistema_solar;

public class Planet {

    private String name = null;
    private int satellites = 0;
    private double weight = 0;
    private double volume = 0;
    private int diameter = 0;
    private int sunDistance = 0;
    private boolean isEyeVisible = false;
    private Type type;

    public Planet(String name, int satellites, double weight, double volume, int diameter, int sunDistance,
            boolean isEyeVisible, Type type) {
        this.name = name;
        this.satellites = satellites;
        this.weight = weight;
        this.volume = volume;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
        this.isEyeVisible = isEyeVisible;
        this.type = type;
    }

    public String getPlanetStats() {
        String stats = "Name: " + name + " Satellites: " + satellites + " Weight: " + weight + " Volume: " + volume
                + " Diametr: " + diameter + " Distance to Sun: " + sunDistance + " Is eye visible: " + isEyeVisible
                + " Type of planet: " + type;
        return stats;

    }

    public boolean isOutter() {
        if (this.sunDistance > 149597870)
            return true;
        return false;
    }

    public double getDenstity() {
        return weight / volume;
    }
}
