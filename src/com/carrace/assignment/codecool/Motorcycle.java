package com.carrace.assignment.codecool;

import java.util.Random;

public class Motorcycle {

    static int nameNumber;
    private String name;
    private int distanceTraveled;
    private int speed;

    Motorcycle(){
        nameNumber++;
        this.name = "Motorcycle " + nameNumber;
        this.distanceTraveled = 0;
        this.speed = 100;

    }

    String getName() {
        return name;
    }

    int getSpeed() {
        return speed;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void moveForAnHour() {
        distanceTraveled += speed;
    }

    void raining() {
        int speedReduce = new Random().nextInt(46) + 5;
        speed -= speedReduce;
    }
}
