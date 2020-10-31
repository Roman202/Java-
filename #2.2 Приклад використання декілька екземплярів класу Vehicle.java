package com.company;


class MoreVehiclesDemo {
    public static void main(String[] args) {
        // об'єкт car1
        Vehicle car1 = new Vehicle();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        // другий екзимпляр класа Vehicle: об'єкт bus1
        Vehicle bus1 = new Vehicle();
        bus1.passengers = 45;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;

        // розрахунок шляху пройденого за 1.25 години
        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;

        System.out.print("car1 може проїхати за 1 годину 15 хвилин відстань ");
        System.out.print(distanceCar + " км з " + car1.passengers);
        System.out.println(" пасажирами ");

        System.out.print("bus1 може проїхати за 1 годину 15 хвилин відстань ");
        System.out.print(distanceBus + " км з " + bus1.passengers);
        System.out.println(" пасажирами ");

    } // main(String[])
} // MoreVehicleDemo class
