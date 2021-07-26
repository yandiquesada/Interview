package com.yalonso.interview.presentation

import android.content.Context
import com.yalonso.interview.data.ProductRepository
import com.yalonso.interview.domain.models.ProductResponse

class ProductViewModel {
    private val productRepository = ProductRepository()

    fun getAllProducts(context: Context): ProductResponse {
        return productRepository.getProducts(context)
    }
}
