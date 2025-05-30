import java.util.HashSet;
import java.util.Set;

public class ProductTracker {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();

        products.add(new Product("Laptop", 999.99));
        products.add(new Product("laptop", 999.99)); // should be duplicate
        products.add(new Product("Phone", 499.49));
        products.add(new Product("Laptop", 999.98)); // maybe different?

        System.out.println("Tracked products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - $" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product other = (Product) obj;
        return name.equalsIgnoreCase(other.name) && price == other.price;
    }

    @Override
    public int hashCode() {
        return name.hashCode(); // 🔥
    }
}
