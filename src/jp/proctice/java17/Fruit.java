package jp.proctice.java17;

public sealed class Fruit permits Fruit.Orange, Mango {

    String verity;
    String origin;
    String taste;

    public String getVerity() {
        return verity;
    }

    public void setVerity(String verity) {
        this.verity = verity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public final static class Orange extends Fruit {


    }
}
