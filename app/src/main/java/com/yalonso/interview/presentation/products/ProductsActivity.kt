package com.yalonso.interview.presentation.products

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.yalonso.interview.R
import com.yalonso.interview.coreFragments.ProducDetailsFragment
import com.yalonso.interview.coreFragments.ProductsFragment
import com.yalonso.interview.coreFragments.ProductsFragment.Companion.newInstance

class ProductsActivity: AppCompatActivity() {

    private lateinit var productsFragment: ProductsFragment
    private lateinit var productsDetailsFragment: ProducDetailsFragment
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.products_activity)
        showProductsFragment()
    }

    protected fun showProductsFragment() {
        productsFragment = newInstance()
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.frame_body, productsFragment)
            .addToBackStack(ProductsFragment.TAG)
            .commit()
    }

//    fun pushProductFragment(product: Product?) {
//        productsDetailsFragment = newInstance(product!!)
//        fragmentManager = supportFragmentManager
//        fragmentManager.beginTransaction()
//            .replace(R.id.frame_body, productsDetailsFragment)
//            .addToBackStack(ProductsFragment.TAG)
//            .commit()
//    }

}