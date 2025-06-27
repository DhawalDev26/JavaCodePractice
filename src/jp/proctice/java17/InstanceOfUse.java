package jp.proctice.java17;

public class InstanceOfUse {

    public static void main(String[] args) {
        InstanceOfUse instance = new InstanceOfUse();

        if (instance instanceof InstanceOfUse) {
            System.out.println("yes it is the use of instanceOf keyword");
        } else {
            System.out.println("else it is not an instanceOf use");
        }
    }
}
