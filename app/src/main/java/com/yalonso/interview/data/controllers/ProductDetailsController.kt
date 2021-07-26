package com.yalonso.interview.data.controllers

import com.yalonso.interview.domain.models.Product

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