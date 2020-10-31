public class SimpleVehicle { // Спрощений варіант класа Vehicle

    int passengers;
}

class RefTypes {
    public static void main(String[] args) {

        SimpleVehicle car1, car2;  // Два посилання на об'єкт типу SimpleVehicle

        car1 = new SimpleVehicle();  // Створюємо об'єкт і посилання нього

        car1.passengers = 25; // Задаємо кількість пасажирів

        // Дві перемінні силаються на один об'єкт
        car2 = car1;

        // Доказуємо це:
        System.out.println("Кількість пасажирів car2 = " + car2.passengers);
        car2.passengers = 50;
        // Якщо car2 i car1 - це один і той же об'єкт, то тепер car1.passengers стало рівно 50

        System.out.println("Кількість пасажирів car1 = " + car1.passengers);
    }
}
