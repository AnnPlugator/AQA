package lesson_5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        printEmployeeInfo();    // Задание 1, 2
        printParkInfo();    // Задание 3
    }

    private static void printEmployeeInfo() {
        // Создать массив из 5 сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ann", "Plugator", "Yreuna", "QA",
                "annapl88@mail.ru", "+375336569321", new BigDecimal("3000"), 35);
        employees[1] = new Employee("Ivan", "Ivanov", "Petrovich", "Developer",
                "ivan.ivanov@mail.ru", "+375296123654", new BigDecimal("2500"), 30);
        employees[2] = new Employee("Maria", "Petrova", "Ivanovna", "Manager",
                "maria.sidorova@mail.ru", "+375444563212", new BigDecimal("2000"), 28);
        employees[3] = new Employee("Petr", "Petrov", "Nikolaevich", "Designer",
                "petr.petrov@mail.ru", "+375291123254", new BigDecimal("1500"), 32);
        employees[4] = new Employee("Elena", "Smirnova", "Sergeevna", "HR",
                "elena.smirnova@mail.ru", "+375334562123", new BigDecimal("3200"), 29);
        System.out.println("Employee Information:");
        for (Employee employee : employees) {
            employee.printInfo();
        }
    }

    private static void printParkInfo() {
        Park park = new Park();
        park.addAttraction("Roller Coaster", "10:00 - 18:00", 25.0);
        park.addAttraction("Snake", "10:00 - 15:00", 30.0);
        park.printAllAttractions();
    }
}