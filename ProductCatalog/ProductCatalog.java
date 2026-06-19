class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(name + " - Rs." + price);
    }
}

class Electronics extends Product {
    int warrantyPeriod;

    Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " Rs." + price +
                " Warranty: " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    String size;
    String material;

    Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " Size: " + size +
                " Material: " + material);
    }
}

class Grocery extends Product {
    String expiryDate;

    Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " Expiry: " + expiryDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {

        Product[] products = {
                new Electronics("Laptop", 80000, 24),
                new Clothing("T-Shirt", 1200, "L", "Cotton"),
                new Grocery("Milk", 90, "2026-06-30")
        };

        for (Product p : products) {
            p.displayDetails();
        }
    }
}