package com.yalonso.interview.controllers

import com.yalonso.interview.models.Product

class ProductDetailsController {
    var product: Product? = null

    companion object {
        @JvmStatic
        private var productControllerInstance: ProductDetailsController? = null
        @JvmStatic
        val instance: ProductDetailsController
            get() {
                if (productControllerInstance == null) {
                    productControllerInstance = ProductDetailsController()
                }
                return productControllerInstance!!
            }
    }
}