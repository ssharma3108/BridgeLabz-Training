import java.util.*;

// Interface
interface Taxable {
    void calculateTax();
    void getTaxDetails();
}

// Abstract class
abstract class Product {
    private int productId;
    private String name;
    private double price;
    protected double discountAmount;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }


    abstract void calculateDiscount();

    // Getters for private fields
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    void displayBill() {
        System.out.println("----------------------------");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: " + price);
    }
}

// Electronics Subclass
class Electronics extends Product implements Taxable {
    private int discountRate;
    private double taxRate;
    private double calculatedTax;

    Electronics(int productId, String name, double price, int discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    // Logic: Calculate discount based on the rate provided in constructor
    @Override
    void calculateDiscount() {
        this.discountAmount = getPrice() * discountRate / 100;
    }

    // Logic: Calculate tax on the price AFTER the discount is applied
    @Override
    public void calculateTax() {
        this.calculatedTax = (getPrice() - discountAmount) * taxRate / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate: " + taxRate + "% | Tax Amount: " + calculatedTax);
    }

    @Override
    void displayBill() {
        super.displayBill();
        System.out.println("Category: Electronics");
        System.out.println("Discount Applied: -" + discountAmount);
        getTaxDetails();
        double finalPrice = getPrice() - discountAmount + calculatedTax;
        System.out.println("Total Payable: " + finalPrice);
    }
}

// Clothing Subclass
class Clothing extends Product implements Taxable {
    private int discountRate;
    private double taxRate;
    private double calculatedTax;

    Clothing(int productId, String name, double price, int discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    @Override
    void calculateDiscount() {
        this.discountAmount = getPrice() * discountRate / 100;
    }

    @Override
    public void calculateTax() {
        this.calculatedTax = (getPrice() - discountAmount) * taxRate / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate: " + taxRate + "% | Tax Amount: " + calculatedTax);
    }

    @Override
    void displayBill() {
        super.displayBill();
        System.out.println("Category: Clothing");
        System.out.println("Discount Applied: -" + discountAmount);
        getTaxDetails();
        double finalPrice = getPrice() - discountAmount + calculatedTax;
        System.out.println("Total Payable: " + finalPrice);
    }
}

// Groceries Subclass
class Groceries extends Product implements Taxable {
    private int discountRate;
    private double taxRate;
    private double calculatedTax;

    Groceries(int productId, String name, double price, int discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    @Override
    void calculateDiscount() {
        this.discountAmount = getPrice() * discountRate / 100;
    }

    @Override
    public void calculateTax() {
        // Groceries might have lower or zero tax logic
        this.calculatedTax = (getPrice() - discountAmount) * taxRate / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Rate: " + taxRate + "% | Tax Amount: " + calculatedTax);
    }

    @Override
    void displayBill() {
        super.displayBill();
        System.out.println("Category: Groceries");
        System.out.println("Discount Applied: -" + discountAmount);
        getTaxDetails();
        double finalPrice = getPrice() - discountAmount + calculatedTax;
        System.out.println("Total Payable: " + finalPrice);
    }
}

// Main Class to run the logic
public class TaxCalculator {
    public static void main(String[] args) {
        // Creating different products
        Electronics laptop = new Electronics(101, "Laptop", 50000, 10, 18);
        Clothing shirt = new Clothing(202, "T-Shirt", 1500, 20, 5);
        Groceries rice = new Groceries(303, "Basmati Rice", 1000, 5, 0);

        Product[] cart = {laptop, shirt, rice};

        for (Product p : cart) {
            p.calculateDiscount();
            if (p instanceof Taxable) {
                ((Taxable) p).calculateTax();
            }
            p.displayBill(); // Show final output
        }
    }
}