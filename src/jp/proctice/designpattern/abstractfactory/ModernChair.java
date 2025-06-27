package jp.proctice.designpattern.abstractfactory;

public class ModernChair implements Chair {
    @Override
    public void function() {
        System.out.println("sitting on modern chair");
    }
}

class VintageChair implements Chair {

    @Override
    public void function() {
        System.out.println("sitting on vintage chair");
    }
}

