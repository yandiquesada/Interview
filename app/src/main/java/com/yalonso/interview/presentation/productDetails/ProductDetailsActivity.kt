package com.yalonso.interview.presentation.productDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.yalonso.interview.R
import com.yalonso.interview.domain.models.Product
import com.yalonso.interview.presentation.products.ProductsFragment

class ProductDetailsActivity: AppCompatActivity() {

    private lateinit var productsDetailsFragment: ProducDetailsFragment
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)
        loadProduct()
    }

    private fun loadProduct() {
        intent.extras?.let{ bundle ->
            val product = bundle.getParcelable<Product>("product")
            product?.let {
                pushProductDetailsFragment(it)
            }
        }
    }

    private fun pushProductDetailsFragment(product: Product) {
        productsDetailsFragment = ProducDetailsFragment.newInstance(product)
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.frame_body, productsDetailsFragment)
            .addToBackStack(ProductsFragment.TAG)
            .commit()
    }
}