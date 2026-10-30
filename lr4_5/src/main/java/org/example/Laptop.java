package org.example;

public class Laptop {
    private String brand;
    private int ram;
    private double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.printf(
                "%s: RAM — %d ГБ, цена — %.2f%n",
                brand, ram, price
        );
    }
}
