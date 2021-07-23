package com.yalonso.interview.coreFragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yalonso.interview.R
import com.yalonso.interview.adapters.ProductAdapter
import com.yalonso.interview.controllers.ProductController
import com.yalonso.interview.controllers.ProductController.Companion.instance
import com.yalonso.interview.framework.BaseFragment

class ProductsFragment : BaseFragment() {
    private lateinit var view: View
    private var context: Context? = null
    private lateinit var productsRecyclerView: RecyclerView
    private var productController: ProductController = instance!!
    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
        context = getContext()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = inflater.inflate(layoutResource, container, false)
        setUpProducts()
        return view
    }

    private fun setUpProducts() {
        productsRecyclerView = view.findViewById(R.id.products)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        productsRecyclerView.setLayoutManager(layoutManager)
        productsRecyclerView.setItemAnimator(DefaultItemAnimator())
        val dividerItemDecoration = DividerItemDecoration(
            productsRecyclerView.getContext(),
            (layoutManager as LinearLayoutManager).orientation
        )
        productsRecyclerView.addItemDecoration(dividerItemDecoration)
        val productList = productController.productList
        val productAdapter = ProductAdapter(context, productList)
        productsRecyclerView.setAdapter(productAdapter)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun getLayoutResource(): Int {
        return R.layout.products
    }

    companion object {
        @JvmField
        var TAG = "ProductsFragment"
        @JvmStatic
        fun newInstance(): ProductsFragment {
            val productsFragment = ProductsFragment()
            val arguments = Bundle()
            productsFragment.arguments = arguments
            return productsFragment
        }
    }
}