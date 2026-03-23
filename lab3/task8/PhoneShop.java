import java.util.ArrayList;

class Category {
    String name;
    Category(String name) {
        this.name = name;
    }
}

class Product {
    String id, name, brand;
    double price;
    int stock;
    Category category;

    Product(String id, String name, double price, int stock, String brand, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.brand = brand;
        this.category = category;
    }

    void display() {
        System.out.printf("| %-5s | %-15s | %-8.2f | %-5d | %-10s | %-12s |%n", id, name, price, stock, brand, category.name);
        System.out.println("=".repeat(75));
    }
}

public class PhoneShop {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Category phones = new Category("Smartphones");
        Category accessories = new Category("Accessories");

        products.add(new Product("001", "iPhone 15",   999.99, 50,  "Apple",   phones));
        products.add(new Product("002", "Galaxy S24",  899.99, 30,  "Samsung", phones));
        products.add(new Product("003", "AirPods Pro", 249.99, 100, "Apple",   accessories));

        System.out.printf("| %-5s | %-15s | %-8s | %-5s | %-10s | %-12s |%n", "ID", "Name", "Price", "Stock", "Brand", "Category");
        System.out.println("=".repeat(75));
        for (Product p : products) {
            p.display();
        }
    }
}