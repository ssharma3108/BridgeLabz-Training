import java.util.ArrayList;
import java.util.List;

/* ---------- CATEGORY HIERARCHY ---------- */
interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

/* ---------- GENERIC PRODUCT CLASS ---------- */
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    public void display() {
        System.out.println(
            "Product: " + name +
            ", Price: " + price +
            ", Category: " + category.getCategoryName()
        );
    }
}

/* ---------- GENERIC CATALOG ---------- */
class Catalog {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<? extends Category> p : products) {
            p.display();
        }
    }
}

/* ---------- GENERIC METHOD (DISCOUNT) ---------- */
class DiscountService {
    public static <T extends Product<? extends Category>> void applyDiscount(
            T product, double percentage) {

        double discountedPrice =
                product.getPrice() - (product.getPrice() * percentage / 100);

        product.setPrice(discountedPrice);
    }
}

/* ---------- MAIN CLASS ---------- */
public class OnlineMarket {
    public static void main(String[] args) {

        Product<BookCategory> book =
            new Product<>("Java Book", 500, new BookCategory());

        Product<ClothingCategory> shirt =
            new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> phone =
            new Product<>("Smartphone", 25000, new GadgetCategory());

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("---- BEFORE DISCOUNT ----");
        catalog.showCatalog();

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(shirt, 20);
        DiscountService.applyDiscount(phone, 5);

        System.out.println("\n---- AFTER DISCOUNT ----");
        catalog.showCatalog();
    }
}
