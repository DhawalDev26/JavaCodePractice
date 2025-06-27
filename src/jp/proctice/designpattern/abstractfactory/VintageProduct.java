package jp.proctice.designpattern.abstractfactory;

public class VintageProduct implements FactoryType {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }
}
