package com.carrace.assignment.codecool;

import java.util.Random;

public class Main {

    //static isRaining //30% chance of rain every hour

    public static void main(String[] args) {
	/*createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
    simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
    printRaceResults() // prints each vehicle's name, distance traveled ant type.
    */
	Car asd = new Car();
	asd.setNormalSpeed(Car.speedLimit(70));
	//System.out.println(asd.getNormalSpeed());
    asd.moveForAnHour();
    asd.setNormalSpeed(Car.speedLimit(70));
    asd.moveForAnHour();
    //System.out.println(asd.getDistanceTraveled());
    Motorcycle a = new Motorcycle();
    Motorcycle b = new Motorcycle();
    b.raining();
        System.out.println(b.getSpeed());
    }

}
