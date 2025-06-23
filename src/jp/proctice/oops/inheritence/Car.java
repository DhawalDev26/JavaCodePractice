package jp.proctice.oops.inheritence;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String price;
    private int speed;
    private String name;

    public Car() {
    }

    public Car(int speed, String price, String name) {
        this.speed = speed;
        this.name = name;
        this.price = price;
    }

    // getter and setter
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedOfCar() {
        return speed;
    }

    //user define methods
    public int speedOfCar() {
        return getSpeedOfCar();
    }

    public List<Car> displayCar() {
        List<Car> carList = new ArrayList<>();

        Car car = new Car(100, "12000", "audi");
        Car car1 = new Car(50, "90000", "Hundi");

        carList.add(car);
        carList.add(car1);

        return carList;
    }
}
