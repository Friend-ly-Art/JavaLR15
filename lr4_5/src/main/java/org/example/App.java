package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Phone phone = new Phone("Samsung", "Galaxy A55", 1500.0);

        System.out.println("До скидки:");
        phone.printInfo();

        phone.applyDiscount(15);

        System.out.println("После скидки 15%:");
        phone.printInfo();
        System.out.println(phone);


        System.out.println("\nЗадание 2:");
        Laptop[] laptops = {
                new Laptop("Lenovo", 16, 2400.0),
                new Laptop("ASUS", 32, 3500.0),
                new Laptop("HP", 8, 1800.0),
                new Laptop("Dell", 64, 4800.0),
                new Laptop("Apple", 24, 6200.0),
                new Laptop("Acer", 16, 2200.0)
        };

        Laptop maxRam = laptops[0];
        Laptop mostExpensive = laptops[0];

        for (int i = 1; i < laptops.length; i++) {
            if (laptops[i].getRam() > maxRam.getRam()) {
                maxRam = laptops[i];
            }

            if (laptops[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = laptops[i];
            }
        }

        System.out.println("Ноутбук с максимальным объёмом RAM:");
        maxRam.printInfo();

        System.out.println("Самый дорогой ноутбук:");
        mostExpensive.printInfo();

        System.out.println("\nЗадание 3:");
        User[] users = {
                new User("Ivan", Role.ADMIN),
                new User("Anna", Role.USER),
                new User("Roma", Role.GUEST),
                new User("Maria", Role.ADMIN),
                new User("Pavel", Role.USER)
        };

        System.out.println("Администраторы:");

        for (User user : users) {
            if (user.getRole() == Role.ADMIN) {
                user.printInfo();
            }
        }

    }
}
