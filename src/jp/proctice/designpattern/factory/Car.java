package jp.proctice.designpattern.factory;

public class Car implements Vehicle {

    @Override
    public void getType() {
        System.out.println("this is 4*4 type vehicle");
    }
}

class Aeroplane implements Vehicle {

    @Override
    public void getType() {
        System.out.println("this is flying type vehicle");
    }
}

class FactoryType {
    public Vehicle getVehicle(String typ) throws IllegalAccessException {
        return switch (typ) {
            case "car" -> new Car();
            case "aeroplane" -> new Aeroplane();
            default -> throw new IllegalAccessException("not used factory class");
        };
    }
}
