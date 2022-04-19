package com.yalonso.interview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yalonso.interview.MainActivity;
import com.yalonso.interview.R;
import com.yalonso.interview.models.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductItemViewHolder>  {

    private Context context;
    private List<Product> productList;


    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_row, parent, false);
        return new ProductItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductItemViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductItemViewHolder extends RecyclerView.ViewHolder {

        private TextView productNumber;
        private TextView productDescription;
        private View itemView;

        private ProductItemViewHolder(@NonNull View itemView) {
            super(itemView);

            productNumber = itemView.findViewById(R.id.product_number);
            productDescription = itemView.findViewById(R.id.description);
            this.itemView = itemView;
        }

        private void bind() {
            int itemPosition = getAdapterPosition();
            Product product = productList.get(itemPosition);

            productNumber.setText(product.productNumber);
            productDescription.setText(product.title);

            itemView.setOnClickListener(this.onClickListener);
        }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int itemPosition = getAdapterPosition();
                Product product = productList.get(itemPosition);
                ((MainActivity) context).pushProductFragment(product);
            }
        };
    }
}
