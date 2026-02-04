package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

class Shop {
    String productNameString;
    double price;
    double rating;
    double discountPercentage;

    Shop(String productNameString, double price, double rating, double discountPercentage) {
        this.productNameString = productNameString;
        this.price = price;
        this.rating = rating;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Product Name -: " + productNameString +
               " | Price -: " + price +
               " | Rating -: " + rating +
               " | Discount Percentage -: " + discountPercentage;
    }
}

public class CustomSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shop> list = new ArrayList<>();

        while (true) {
            System.err.print("Enter your choice -: 1 for add | 2 for sort by price | 3 for sort by rating | 4 for sort by discount | 5 for exit -: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the product Name -: ");
                String nameString = scanner.next();
                System.out.print("Enter the price -: ");
                double price = scanner.nextDouble();
                System.out.print("Enter the rating -: ");
                double rating = scanner.nextDouble();
                System.out.print("Enter the discount percentage -: ");
                double percentage = scanner.nextDouble();

                list.add(new Shop(nameString, price, rating, percentage));

            } else if (choice == 2) {
                // sort by price (ascending)
                list.stream()
                    .sorted(Comparator.comparing(p -> p.price))
                    .forEach(System.out::println);

            } else if (choice == 3) {
                // sort by rating (ascending)
                list.stream()
                    .sorted(Comparator.comparing(p -> p.rating))
                    .forEach(System.out::println);

            } else if (choice == 4) {
                // sort by discount percentage (ascending)
                list.stream()
                    .sorted(Comparator.comparing(p -> p.discountPercentage))
                    .forEach(System.out::println);

            } else if (choice == 5) {
                System.out.println("Thank you !");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
