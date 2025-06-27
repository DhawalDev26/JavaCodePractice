package jp.proctice.designpattern.builder;

public class Burger {

    private String category;
    private String name;
    private Boolean onion;
    private Boolean tomato;
    private Boolean Drinks;

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public Boolean getOnion() {
        return onion;
    }

    public Boolean getTomato() {
        return tomato;
    }

    public Boolean getDrinks() {
        return Drinks;
    }

    private Burger(BurgerBuilder burgerBuilder) {
        this.category = burgerBuilder.category;
        this.name = burgerBuilder.name;
        this.onion = burgerBuilder.onion;
        this.tomato = burgerBuilder.tomato;
        this.Drinks = burgerBuilder.Drinks;
    }

    public static class BurgerBuilder {

        private String category;
        private String name;
        private Boolean onion;
        private Boolean tomato;
        private Boolean Drinks;

        public BurgerBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public BurgerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BurgerBuilder setOnion(Boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder setTomato(Boolean Drinks) {
            this.Drinks = Drinks;
            return this;
        }

        public BurgerBuilder setDrinks(Boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}

