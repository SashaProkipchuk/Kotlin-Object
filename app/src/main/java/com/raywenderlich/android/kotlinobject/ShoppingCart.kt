package com.raywenderlich.android.kotlinobject

import java.lang.ref.WeakReference

object ShoppingCart {
    // 1.
    @JvmStatic
    var products: List<Product> = emptyList()
        private set

    private var onCartChangedListener: WeakReference<OnCartChangedListener>? = null

    fun setOnCartChangedListener(listener: OnCartChangedListener) {
        this.onCartChangedListener = WeakReference(listener)
    }

    private fun notifyCartChanged() {
        onCartChangedListener?.get()?.onCartChanged()
    }

    // 2.
    fun addProduct(product: Product) {
        products = products + listOf(product)
        notifyCartChanged()
    }

    // 3.
    fun clear() {
        products = emptyList()
        notifyCartChanged()
    }

    interface OnCartChangedListener {
        fun onCartChanged()
    }

}