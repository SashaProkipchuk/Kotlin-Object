package com.raywenderlich.android.kotlinobject

object ShoppingCart {
    // 1.
    var products: List<Product> = emptyList()
        private set

    // 2.
    fun addProduct(product: Product) {
        products = products + listOf(product)
    }

    // 3.
    fun clear() {
        products = emptyList()
    }

}