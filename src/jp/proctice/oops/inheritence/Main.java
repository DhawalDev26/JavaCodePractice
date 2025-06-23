package jp.proctice.oops.inheritence;

public class Main {
    public static void main(String[] args) {
        for (Car car : new Car().displayCar()) {
            System.out.println(car.speedOfCar());
        }
    }
}
