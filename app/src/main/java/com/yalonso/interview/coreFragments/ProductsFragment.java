package com.yalonso.interview.coreFragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yalonso.interview.R;
import com.yalonso.interview.adapters.ProductAdapter;
import com.yalonso.interview.repositories.ProductRepository;
import com.yalonso.interview.framework.BaseFragment;
import com.yalonso.interview.models.Product;

import java.util.List;

public class ProductsFragment extends BaseFragment {
    public static String TAG = "ProductsFragment";

    private View view;
    private Context context;
    private RecyclerView productsRecyclerView;
    private ProductRepository productRepository;

    public static ProductsFragment newInstance() {
        ProductsFragment productsFragment = new ProductsFragment();

        Bundle arguments  = new Bundle();
        productsFragment.setArguments(arguments);

        return productsFragment;
    }

    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        context = getActivity();
        productRepository = ProductRepository.getInstance();

        if (getArguments() != null) {
            //get arguments get parcelable
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(getLayoutResource(), container, false);
        setUpProducts();
        return view;
    }

    private void setUpProducts() {
        productsRecyclerView = view.findViewById(R.id.products);
        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        productsRecyclerView.setLayoutManager(layoutManager);
        productsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(productsRecyclerView.getContext(), ((LinearLayoutManager) layoutManager).getOrientation());
        productsRecyclerView.addItemDecoration(dividerItemDecoration);

        List<Product> productList = productRepository.getProductList();
        ProductAdapter productAdapter = new ProductAdapter(context, productList);
        productsRecyclerView.setAdapter(productAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.products;
    }
}
