package com.yalonso.interview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.yalonso.interview.coreFragments.ProducDetailsFragment;
import com.yalonso.interview.coreFragments.ProductsFragment;
import com.yalonso.interview.models.Product;

public class ProductsActivity extends AppCompatActivity {

    ProductsFragment productsFragment;
    ProducDetailsFragment productsDetailsFragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // setContentView();

        pushFragment();
    }

    protected void pushFragment() {
        productsFragment = ProductsFragment.newInstance();

        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_body, productsFragment)
                .addToBackStack(ProductsFragment.TAG)
                .commit();
    }

    public void pushProductFragment(Product product) {
        productsDetailsFragment = ProducDetailsFragment.newInstance(product);

        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_body, productsDetailsFragment)
                .addToBackStack(ProductsFragment.TAG)
                .commit();
    }
}
