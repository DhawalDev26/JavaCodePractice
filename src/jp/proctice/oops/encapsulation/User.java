package jp.proctice.oops.encapsulation;

import java.sql.SQLOutput;

public class User {
    public static void main(String[] args) {

        TestEncapsulation testEncapsulation = new TestEncapsulation();
        testEncapsulation.setId(101L);
        testEncapsulation.setName("Dhawal");
        testEncapsulation.setAge("25");

        System.out.println("this is my id:" + testEncapsulation.getId());
        System.out.println("this is my name:" + testEncapsulation.getName());
        System.out.println("this is my age:" + testEncapsulation.getAge());
    }
}