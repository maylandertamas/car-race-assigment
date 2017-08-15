package com.carrace.assignment.codecool;

import java.util.Random;

public class Truck {

    private String name;
    private int speed;
    private int breakdownTurnsLeft;
    private int distanceTraveled;
    private String type;

    Truck() {
        Integer createName = new Random().nextInt(1001);
        this.name = createName.toString();
        this.speed = 100;
        this.breakdownTurnsLeft = 0;
        this.type = "Truck";

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

    void moveForAnHour() {
        if (breakdownTurnsLeft > 0) {
            breakdownTurnsLeft--;
        } else if (breakdownTurnsLeft == 0) {
            int breakDownChance = new Random().nextInt(100);
            if (breakDownChance <= 4) {
                breakdownTurnsLeft = 2;
                speed = 0;
            } else {
                speed = 100;
            }
        }
        distanceTraveled += speed;
    }

}
