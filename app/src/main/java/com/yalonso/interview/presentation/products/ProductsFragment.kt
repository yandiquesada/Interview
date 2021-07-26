package com.yalonso.interview.presentation.products

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yalonso.interview.R
import com.yalonso.interview.domain.models.Product
import com.yalonso.interview.presentation.products.adapters.ProductAdapter
import com.yalonso.interview.framework.BaseFragment
import com.yalonso.interview.presentation.ProductViewModel
import com.yalonso.interview.presentation.productDetails.ProductDetailsActivity

class ProductsFragment : BaseFragment() {
    private lateinit var view: View
    private lateinit var productsRecyclerView: RecyclerView
    private var productViewModel = ProductViewModel()

    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)
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
        context?.let { context ->
            productsRecyclerView = view.findViewById(R.id.products)
            val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
            productsRecyclerView.setLayoutManager(layoutManager)
            productsRecyclerView.setItemAnimator(DefaultItemAnimator())
            val dividerItemDecoration = DividerItemDecoration(
                productsRecyclerView.getContext(),
                (layoutManager as LinearLayoutManager).orientation
            )
            productsRecyclerView.addItemDecoration(dividerItemDecoration)
            val productList = productViewModel.getAllProducts(context)

            val onProductSelectedAction: (product: Product) -> Any = { product ->
                val intent  = Intent(context, ProductDetailsActivity::class.java)
                val bundle = Bundle()
                bundle.putParcelable("product", product)
                intent.putExtras(bundle)
                startActivity(intent)
            }

            val productAdapter = ProductAdapter(context, productList.productData.products, onProductSelectedAction)
            productsRecyclerView.setAdapter(productAdapter)
        }
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
        var TAG = ProductsFragment::class.java.simpleName

        @JvmStatic
        fun newInstance(): ProductsFragment {
            val productsFragment = ProductsFragment()
            val arguments = Bundle()
            productsFragment.arguments = arguments
            return productsFragment
        }
    }
}