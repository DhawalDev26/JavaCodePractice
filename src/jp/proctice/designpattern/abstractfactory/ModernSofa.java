package jp.proctice.designpattern.abstractfactory;

public class ModernSofa implements Sofa {
    @Override
    public void function() {
        System.out.println("relaxing on modern sofa");
    }
}

class VintageSofa implements Sofa {
    @Override
    public void function() {
        System.out.println("relaxing on vintage sofa");
    }
}
