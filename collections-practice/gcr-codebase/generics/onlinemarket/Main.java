package onlinemarket;

import java.util.ArrayList;
import java.util.List;


        Product<BookCategory> book =
            new Product<>("Java Book", 500, new BookCategory());
 uct<ClothingCategory> shirt =
            new Product<>("T-Shirt", 1200, new ClothingCategory());
 uct<GadgetCategory> phone =
            new Product<>("Smartphone", 25000, new GadgetCategory());
 log catalog = new Catalog();
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
