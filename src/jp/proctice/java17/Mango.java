package jp.proctice.java17;

public final class Mango extends Fruit {

    public static void main(String[] args) {
        Mango mango = new Mango();
        mango.setTaste("sweet");
        mango.setOrigin("Ratnagiri");
        mango.setVerity("Hapus");

        System.out.println("this is mango fruit with: " + mango.getVerity() + ", " + mango.getTaste() + " and it originate from: " + mango.getOrigin());
    }
}
