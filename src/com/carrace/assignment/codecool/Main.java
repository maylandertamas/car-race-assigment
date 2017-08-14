package com.carrace.assignment.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {

    static List<Car> carList = new ArrayList<>();
    static List<Motorcycle> motorcycleList = new ArrayList<>();
    static List<Truck> truckList = new ArrayList<>();

    static boolean isRaining() {
        int chanceToRain = new Random().nextInt(101);
        if (chanceToRain <= 30) {
            return true;
        } else {
            return false;
        }
    }

    static void createVehicles() {
        for (int i = 0; i < 10; i++) {
            carList.add(new Car());
            motorcycleList.add(new Motorcycle());
            truckList.add(new Truck());
        }
    }

    public static void simulateRace(List<Car> carList, List<Motorcycle> motorcycleList, List<Truck> truckList) {
        for (int a = 0; a < 1; a++) {
            carList.stream().forEach(p -> p.setNormalSpeed(Car.speedLimit(70)));
            carList.stream().forEach(k -> k.moveForAnHour());
        }
    }

    public static void main(String[] args) {
        createVehicles();
        simulateRace(carList, motorcycleList, truckList);

        List<Integer> trv = carList.stream().map(p -> p.getDistanceTraveled()).collect(Collectors.toList());
        //List<String> af = carList.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(trv);


        /*simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
    printRaceResults() // prints each vehicle's name, distance traveled ant type.
    */

	/*Car asd = new Car();
	asd.setNormalSpeed(Car.speedLimit(70));
	//System.out.println(asd.getNormalSpeed());
    asd.moveForAnHour();
    asd.setNormalSpeed(Car.speedLimit(70));
    asd.moveForAnHour();
    //System.out.println(asd.getDistanceTraveled());
    Motorcycle a = new Motorcycle();
    Motorcycle b = new Motorcycle();
    b.raining();
        System.out.println(b.getSpeed());*/
    }

}
