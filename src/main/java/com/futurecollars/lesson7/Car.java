package com.futurecollars.lesson7;

import java.util.Objects;

public class Car {
    // private - widoczne tylko w obrębie klasy, w której zostały zdefiniowane
    // <domyślny> - package-private - widoczny w klasie oraz w innych klasach z tego samego pakietu
    // protected - związany z dziedizczeniem - więcej pod koniec zajęć
    // public - widoczne wszędzie
    private String brand;
    private String model;
    private String color;
    private int horsePower;

    public Car() {}

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, String color, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    //gettery i settery

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() > 30) {
            this.model = model.substring(0, 29);
        } else {
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
