package jp.proctice.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Car implements Comparable<Car> {

    String name;
    Double price;
    String year;

    Car(String name, Double price, String year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car car) {
        boolean b = car.getPrice() < car.getPrice();
        if (b) {
            return Integer.parseInt(car.year);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("audi", 20000.0, "2020"));
        cars.add(new Car("BMW", 350000.0, "1995"));
        cars.add(new Car("lexus", 150000.00, "1992"));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.getName() + " " + car.getPrice() + " " + car.getYear());
        }
    }
}
