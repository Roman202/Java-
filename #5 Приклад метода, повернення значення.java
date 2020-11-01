package com.company;

public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;


    // Оголошуємо метод, вичисляючий пройдений шлях.
    // Тепер він повертає вичисленне значення типу double

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    } // distance(double interval)
} // Vehicle class

class VehicleRetMethod {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        // Другий екземпляр класса Vehicle
        Vehicle bus = new Vehicle();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        // Розрахунок шляху, пройденого за 0.5 години
        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.print("Автомобіль з " + car.passengers + " пасажирами ");
        car.distance(time);
        System.out.println("Пройдений за півгодини шлях " + distanceCar + " км. ");

        System.out.print("Автобус з " + bus.passengers + " пасажирами ");
        bus.distance(time);
        System.out.println("Пройдений за півгодини шлях " + distanceBus + " км. ");


    }
}
