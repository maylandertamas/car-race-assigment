package com.carrace.assignment.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Car {

    private String name;
    private int normalSpeed;
    private int distanceTraveled;
    private String type;

    public Car (){

        List<String> primNameList = Arrays.asList("Sanctuary", "Falcon", "Triumph", "Lightning",
                "Aurora", "Spire", "Formula", "Motion", "Paladin", "Epitome");
        List<String> nameList = new ArrayList<>(primNameList);

        String newName = nameList.get((new Random()).nextInt(nameList.size()))
                + " " + nameList.get((new Random()).nextInt(nameList.size()));
        this.name = newName;

        this.normalSpeed = 0;
        this.distanceTraveled = 0;
        this.type = "Car";

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

    void setNormalSpeed(int speed) {
        normalSpeed = speed;
    }

    void moveForAnHour() {
        distanceTraveled += normalSpeed;
    }

    static int speedLimit(int limit) {
        int chanteToLimit = new Random().nextInt(100);
        if (chanteToLimit <= 29) {
            return limit;
        } else {
            return new Random().nextInt(31) + 80;
        }
    }
}
