package com.raywenderlich.android.kotlinobject;

import java.util.List;

public class ShoppingCartCalculator {
    Integer calculateTotalFromShoppingCart() {
        List<Product> products = ShoppingCart.getProducts();
        int totalPriceCents = 0;
        for (Product product : products) {
            totalPriceCents += product.getPriceCents();
        }

        return totalPriceCents;
    }

}
