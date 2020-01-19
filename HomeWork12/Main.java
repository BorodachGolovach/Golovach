package HomeWork12;

import java.util.HashSet;


public class Main {
    public static void main(String args[]) {


}

public class Product {
    public int id;
    public String name;
    public int price;

    public Product(String value, int id, int price) {
        this.id = id;
        this.name = value;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class Shopp {

    public void addProduct() {
        HashSet<Product> products = new HashSet<Product>();
        products.add(new Product("Milk", 2, 1));
        products.add(new Product("Sugar", 33, 2));
        products.add(new Product("Meet", 34, 10));
        products.add(new Product("Banana", 155, 3));
        for (Product p : products) {
            System.out.print(p.getName() + " ");
            System.out.print(p.getId() + " ");
            System.out.println(p.getPrice());
        }
    }

        public void getAllProduct () {
        HashSet<Product> products = new HashSet<Product>();

        }
    }
}
