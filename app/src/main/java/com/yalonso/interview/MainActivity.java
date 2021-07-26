package com.yalonso.interview;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.yalonso.interview.presentation.productDetails.ProducDetailsFragment;
import com.yalonso.interview.presentation.products.ProductsFragment;
import com.yalonso.interview.presentation.products.ProductsActivity;

public class MainActivity extends AppCompatActivity {

    ProductsFragment productsFragment;
    ProducDetailsFragment productsDetailsFragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, ProductsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
