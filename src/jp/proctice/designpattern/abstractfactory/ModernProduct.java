package jp.proctice.designpattern.abstractfactory;

public class ModernProduct implements FactoryType {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
