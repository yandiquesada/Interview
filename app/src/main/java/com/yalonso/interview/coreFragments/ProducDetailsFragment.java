package com.yalonso.interview.coreFragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yalonso.interview.R;
import com.yalonso.interview.controllers.ProductDetailsController;
import com.yalonso.interview.framework.BaseFragment;
import com.yalonso.interview.models.Product;

public class ProducDetailsFragment extends BaseFragment {
    private View view;
    private Context context;
    private TextView tvDescription;
    private TextView tvNumber;
    private TextView tvPrice;
    private TextView tvAvailability;
    private TextView tvBrand;
    private ProductDetailsController productController;

    private static String descriptionKey = "desc";
    private static String availabilityKey = "availa";
    private static String priceKey = "price";
    private static String brandKey = "brand";
    private static String numberKey = "number";

    public static ProducDetailsFragment newInstance(Product product) {
        ProducDetailsFragment productsFragment = new ProducDetailsFragment();

        Bundle arguments  = new Bundle();
        arguments.putString(descriptionKey, product.productDescription);
        arguments.putString(availabilityKey, product.availability);
        arguments.putString(priceKey, product.price);
        arguments.putString(brandKey, product.brand);
        arguments.putString(numberKey, product.productNumber);
        productsFragment.setArguments(arguments);

        return productsFragment;
    }

    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        context = getActivity();
        productController = ProductDetailsController.getInstance();

        if (getArguments() != null) {
            Bundle bundle = getArguments();
            Product product = new Product();
            product.brand = bundle.getString(brandKey);
            product.productDescription = bundle.getString(descriptionKey);
            product.productNumber = bundle.getString(numberKey);
            product.price = bundle.getString(priceKey);
            product.availability = bundle.getString(availabilityKey);
            productController.product = product;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(getLayoutResource(), container, false);
        setUpProduct();
        return view;
    }

    private void setUpProduct() {
        tvAvailability = view.findViewById(R.id.tvAvailability);
        tvDescription = view.findViewById(R.id.tvDescription);
        tvBrand = view.findViewById(R.id.tvBrand);
        tvNumber = view.findViewById(R.id.tvNumber);
        tvPrice = view.findViewById(R.id.tvPrice);

        Product product = productController.product;

        tvAvailability.setText(product.availability);
        tvDescription.setText(product.productDescription);
        tvBrand.setText(product.brand);
        tvNumber.setText(product.productNumber);
        tvPrice.setText(product.price);
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
