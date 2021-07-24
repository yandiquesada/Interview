package com.yalonso.interview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yalonso.interview.MainActivity
import com.yalonso.interview.R
import com.yalonso.interview.adapters.ProductAdapter.ProductItemViewHolder
import com.yalonso.interview.models.Product

class ProductAdapter(private val context: Context, private val productList: List<Product>) :
    RecyclerView.Adapter<ProductItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row, parent, false)
        return ProductItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class ProductItemViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val productNumber: TextView
        private val productDescription: TextView
        // private val itemView: View

        fun bind() {
            val itemPosition = adapterPosition
            val (productNumber1, productDescription1) = productList[itemPosition]
            productNumber.text = productNumber1
            productDescription.text = productDescription1
            itemView.setOnClickListener(onClickListener)
        }

        var onClickListener = View.OnClickListener {
//            val itemPosition = adapterPosition
//            val product = productList[itemPosition]
//            (context as MainActivity).pushProductFragment(product)
        }

        init {
            productNumber = itemView.findViewById(R.id.product_number)
            productDescription = itemView.findViewById(R.id.description)
            // this.itemView = itemView
        }
    }
}