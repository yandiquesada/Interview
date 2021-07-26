package com.yalonso.interview.presentation.products.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yalonso.interview.R
import com.yalonso.interview.presentation.products.adapters.ProductAdapter.ProductItemViewHolder
import com.yalonso.interview.domain.models.Product

class ProductAdapter(private val context: Context,
                     private val productList: List<Product>,
                     private val onProductSelectedAction: (product: Product) -> Any) :
    RecyclerView.Adapter<ProductItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row, parent, false)
        return ProductItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 0
    }

    inner class ProductItemViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val productNumber: TextView
        private val productDescription: TextView

        fun bind() {
            val itemPosition = adapterPosition
            val product = productList[itemPosition]
            productNumber.text = product.productNumber

            itemView.setOnClickListener(onClickListener)
        }

        var onClickListener = View.OnClickListener {
            val itemPosition = adapterPosition
            val product = productList[itemPosition]

        }

        init {
            productNumber = itemView.findViewById(R.id.product_number)
            productDescription = itemView.findViewById(R.id.description)
        }
    }
}