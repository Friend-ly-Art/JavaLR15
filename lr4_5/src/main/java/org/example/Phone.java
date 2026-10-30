package org.example;


public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void applyDiscount(double discount) {
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException(
                    "Скидка должна быть от 0 до 100 процентов"
            );
        }
        price *= 1 - discount / 100.0;
    }

    public void printInfo() {
        System.out.printf("%s %s — %.2f%n", brand, model, price);
    }

    @Override
    public String toString(){
        return brand + " " + model + " " + price;
    }
}