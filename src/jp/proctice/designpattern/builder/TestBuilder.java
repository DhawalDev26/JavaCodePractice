package jp.proctice.designpattern.builder;

public class TestBuilder {

    public static void main(String[] args) {
        Burger build = new Burger.BurgerBuilder()
                .setCategory("veg")
                .setName("spicy RedHot")
                .setOnion(true)
                .setTomato(true)
                .setDrinks(true)
                .build();

        System.out.println("this is my order: " + build.getCategory() + " burger of name: " + build.getName() + " with: " + build.getOnion() + " , " + build.getTomato() + " and i also want drinks: " + build.getDrinks());
    }

}