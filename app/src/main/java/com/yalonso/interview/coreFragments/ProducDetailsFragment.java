package com.yalonso.interview.coreFragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yalonso.interview.R;
import com.yalonso.interview.framework.BaseFragment;
import com.yalonso.interview.models.Product;

public class ProducDetailsFragment extends BaseFragment {
    private View view;
    private Context context;
    private ImageView productImage;

    private static String descriptionKey = "desc";
    private static String availabilityKey = "availa";
    private static String priceKey = "price";
    private static String brandKey = "brand";
    private static String numberKey = "number";
    private static String imageUrlKey = "imageUrl";

    public static ProducDetailsFragment newInstance(Product product) {
        ProducDetailsFragment productsFragment = new ProducDetailsFragment();

        Bundle arguments  = new Bundle();
        arguments.putString(descriptionKey, product.title);
        arguments.putString(availabilityKey, product.inventory);
        arguments.putString(numberKey, product.productNumber);
        arguments.putString(brandKey, product.brand);
        arguments.putString(imageUrlKey, product.imageUrl);
        productsFragment.setArguments(arguments);

        return productsFragment;
    }

    private Product product = null;

    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        context = getActivity();

        if (getArguments() != null) {
            Bundle bundle = getArguments();
            product = new Product();
            product.title = bundle.getString(descriptionKey);
            product.productNumber = bundle.getString(numberKey);
            product.inventory = bundle.getString(availabilityKey);
            product.brand = bundle.getString(brandKey);
            product.imageUrl = bundle.getString(imageUrlKey);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(getLayoutResource(), container, false);
        setUpProduct();
        return view;
    }

    private void setUpProduct() {
        productImage = view.findViewById(R.id.productImage);
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
        return R.layout.fragment_product_details;
    }
}
