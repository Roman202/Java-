package com.company;

public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;


    // Оголошуємо метод, вичисляючий пройдений шлях.
    // метод приймає пареметр interval, задаючий час, і не повертає ніякого значення (void)

    void distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("Пройдений шлях, = " + value + " км. ");
    } // distance (double interval)
} // Vehicle class

class VehicleMethodDemo {
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

        System.out.print("Автомобіль з " + car.passengers + " пасажирами ");
        car.distance(time);

        System.out.print("Автобус з " + bus.passengers + " пасажирами ");
        bus.distance(time);
    }
}