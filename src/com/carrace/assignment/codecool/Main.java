package com.carrace.assignment.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Comparator;

public class Main {

    static boolean isRaining() {
        int chanceToRain = new Random().nextInt(100);
        if (chanceToRain <= 29) {
            return true;
        } else {
            return false;
        }
    }

    static void createVehicles(List<Car> carList, List<Motorcycle> motorcycleList, List<Truck> truckList) {
        for (int i = 0; i < 10; i++) {
            carList.add(new Car());
            motorcycleList.add(new Motorcycle());
            truckList.add(new Truck());
        }
    }

    static void simulateRace(List<Car> carList, List<Motorcycle> motorcycleList, List<Truck> truckList) {
        for (int a = 0; a < 50; a++) {

            // Simulate cars (with the chance of speed limit)
            carList.stream().forEach(p -> p.setNormalSpeed(Car.speedLimit(70)));
            carList.stream().forEach(k -> k.moveForAnHour());

            // Simulate motorcycles (with the chance of rain)
            if (isRaining()) {
                motorcycleList.stream().forEach(p -> p.raining());
                motorcycleList.stream().forEach(k -> k.moveForAnHour());
            } else {
                motorcycleList.stream().forEach(p -> p.setDefaultSpeed());
                motorcycleList.stream().forEach(k -> k.moveForAnHour());
            }

            // Simulate trucks (with the chance of breakdown)
            truckList.stream().forEach(k -> k.moveForAnHour());
        }
    }

    static void printRaceResults(List<Car> carList, List<Motorcycle> motorcycleList, List<Truck> truckList) {

        List<List<String>> resultList = new ArrayList<>();

        // add every car's details as a list to resultList
        for (Car car : carList) {
            List<String> temp = new ArrayList<>();
            String stringifiedTravelledDistance = new Integer(car.getDistanceTraveled()).toString();

            temp.add(car.getName());
            temp.add(stringifiedTravelledDistance);
            temp.add(car.getType());
            resultList.add(temp);
        }

        // add every motorcycle's details as a list to resultList
        for (Motorcycle motorcycle : motorcycleList) {
            List<String> temp = new ArrayList<>();
            String stringifiedTravelledDistance = new Integer(motorcycle.getDistanceTraveled()).toString();

            temp.add(motorcycle.getName());
            temp.add(stringifiedTravelledDistance);
            temp.add(motorcycle.getType());

            resultList.add(temp);
        }

        // add every truck's details as a list to resultList
        for (Truck truck: truckList) {
            List<String> temp = new ArrayList<>();
            String stringifiedTravelledDistance = new Integer(truck.getDistanceTraveled()).toString();

            temp.add(truck.getName());
            temp.add(stringifiedTravelledDistance);
            temp.add(truck.getType());

            resultList.add(temp);
        }

        resultList.sort(Comparator.comparing(l -> Integer.valueOf(l.get(1))));
        System.out.println(resultList);
    }

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        List<Motorcycle> motorcycleList = new ArrayList<>();
        List<Truck> truckList = new ArrayList<>();

        createVehicles(carList, motorcycleList, truckList);
        simulateRace(carList, motorcycleList, truckList);

        printRaceResults(carList, motorcycleList, truckList);
    }

}
