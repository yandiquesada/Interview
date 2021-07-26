package com.yalonso.interview.presentation.productDetails


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.yalonso.interview.R
import com.yalonso.interview.framework.BaseFragment
import com.yalonso.interview.domain.models.Product

import kotlin.jvm.JvmStatic;

class ProducDetailsFragment : BaseFragment() {
    private lateinit var view: View
    private lateinit var tvDescription: TextView
    private lateinit var tvNumber: TextView
    private lateinit var tvPrice: TextView
    private lateinit var tvAvailability: TextView
    private lateinit var tvBrand: TextView
    private var product: Product? = null

    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstance)

        if (arguments != null) {
            val bundle = arguments
            product = Product()
            product?.apply {
                brand = bundle!!.getString(brandKey)!!
                productDescription = bundle.getString(descriptionKey)!!
                productNumber = bundle.getString(numberKey)!!
                price = bundle.getString(priceKey)!!
                availability = bundle.getString(availabilityKey)!!
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = inflater.inflate(layoutResource, container, false)
        setUpProduct()
        return view
    }

    private fun setUpProduct() {
        tvAvailability = view.findViewById(R.id.tvAvailability)
        tvDescription = view.findViewById(R.id.tvDescription)
        tvBrand = view.findViewById(R.id.tvBrand)
        tvNumber = view.findViewById(R.id.tvNumber)
        tvPrice = view.findViewById(R.id.tvPrice)
        tvAvailability.setText(product?.availability)
        tvDescription.setText(product?.productDescription)
        tvBrand.setText(product?.brand)
        tvNumber.setText(product?.productNumber)
        tvPrice.setText(product?.price)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun getLayoutResource(): Int {
        return R.layout.fragment_product_details
    }

    companion object {
        private const val descriptionKey = "desc"
        private const val availabilityKey = "availa"
        private const val priceKey = "price"
        private const val brandKey = "brand"
        private const val numberKey = "number"

        @JvmStatic
        fun newInstance(product: Product): ProducDetailsFragment {
            val productsFragment = ProducDetailsFragment()
            val arguments = Bundle()
            arguments.putString(descriptionKey, product.productDescription)
            arguments.putString(availabilityKey, product.availability)
            arguments.putString(priceKey, product.price)
            arguments.putString(brandKey, product.brand)
            arguments.putString(numberKey, product.productNumber)
            productsFragment.arguments = arguments
            return productsFragment
        }
    }
}