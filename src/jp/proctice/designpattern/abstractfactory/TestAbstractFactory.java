package jp.proctice.designpattern.abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        ModernProduct modernProduct = new ModernProduct();

        modernProduct.createChair().function();
        modernProduct.createSofa().function();

        VintageProduct vintageProduct = new VintageProduct();
        vintageProduct.createChair();
        vintageProduct.createSofa();

    }

}
