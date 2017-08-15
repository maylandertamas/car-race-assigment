package com.carrace.assignment.codecool;

import java.util.Random;

public class Motorcycle {

    static int nameNumber;
    private String name;
    private int distanceTraveled;
    private int speed;
    private String type;

    Motorcycle(){
        nameNumber++;
        this.name = "Motorcycle " + nameNumber;
        this.distanceTraveled = 0;
        this.speed = 100;
        this.type = "Motorcycle";

    }

    String getName() {
        return name;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    String getType() {
        return type;
    }

    void setDefaultSpeed() {
        speed = 100;
    }

    void moveForAnHour() {
        distanceTraveled += speed;
    }

    void raining() {
        int speedReduce = new Random().nextInt(46) + 5;
        speed -= speedReduce;
    }
}
