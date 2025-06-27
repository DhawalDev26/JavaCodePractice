package jp.proctice.java17;

public class Mountain {
    String name;
    String height;

    public Mountain(String name, String height) {
        this.name = name;
        this.height = height;
    }

    public static void main(String[] args) {

        Mountain mountain = new Mountain("everest", "12000");

        if (mountain instanceof Mountain) {
            System.out.println("and mountain is a instance Of Object");
        }

        Object obj = "Hello, Java";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
