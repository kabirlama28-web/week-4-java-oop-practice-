class FoodItem {
    private String name;
    private double price;

    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayMenuItem() {
        System.out.println(name + " Rs." + price);
    }

    public String getName() {
        return name;
    }
}

class Pizza extends FoodItem {
    String size;

    Pizza(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    void displayMenuItem() {
        System.out.println(getName() + " Size: " + size);
    }
}

class Burger extends FoodItem {
    boolean cheese;

    Burger(String name, double price, boolean cheese) {
        super(name, price);
        this.cheese = cheese;
    }

    @Override
    void displayMenuItem() {
        System.out.println(getName() + " Cheese: " + cheese);
    }
}

class Salad extends FoodItem {
    String ingredient;

    Salad(String name, double price, String ingredient) {
        super(name, price);
        this.ingredient = ingredient;
    }

    @Override
    void displayMenuItem() {
        System.out.println(getName() + " Ingredient: " + ingredient);
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {

        FoodItem[] items = {
                new Pizza("Pepperoni",800,"Large"),
                new Burger("Chicken Burger",500,true),
                new Salad("Green Salad",300,"Lettuce")
        };

        for(FoodItem item : items) {
            item.displayMenuItem();
        }
    }
}