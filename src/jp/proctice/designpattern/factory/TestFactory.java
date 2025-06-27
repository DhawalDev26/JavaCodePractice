package jp.proctice.designpattern.factory;

import java.util.Scanner;

public class TestFactory {
    public static void main(String[] args) throws IllegalAccessException {

        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        FactoryType factoryType = new FactoryType();
        Vehicle vehicle = factoryType.getVehicle(type);
        vehicle.getType();

    }
}
