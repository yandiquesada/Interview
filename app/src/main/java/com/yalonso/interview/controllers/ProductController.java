package com.yalonso.interview.controllers;

import com.yalonso.interview.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private static ProductController productControllerInstance;

    public static ProductController getInstance() {
        if (productControllerInstance == null) {
            productControllerInstance = new ProductController();
        }
        return productControllerInstance;
    }

    public List<Product> getProductList() {
        ArrayList<Product> productList = new ArrayList<>();
        Product product = new Product();
        product.productNumber = "24ANB748C003";
        product.productDescription = "4 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Coastal Unit";
        product.availability = "4";
        product.price = "2500";
        product.brand = "Carrier";
        productList.add(product);

        product = new Product();
        product.productNumber = "24ANB736C003";
        product.productDescription = "3 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Coastal Unit";
        product.availability = "12";
        product.price = "2300";
        product.brand = "Carrier";
        productList.add(product);

        product = new Product();
        product.productNumber = "24ACC618A003";
        product.productDescription = "1.5 Ton 16 SEER Residential Air Conditioner Condensing Unit";
        product.availability = "8";
        product.price = "2100";
        product.brand = "Carrier";
        productList.add(product);

        product = new Product();
        product.productNumber = "24ANB630A003";
        product.productDescription = "2.5 Ton 16 SEER Residential Air Conditioner Condensing Unit";
        product.availability = "6";
        product.price = "1200";
        product.brand = "Carrier";
        productList.add(product);

        product = new Product();
        product.productNumber = "24ANB618A003";
        product.productDescription = "1.5 Ton 16 SEER Residential Air Conditioner Condensing Unit";
        product.availability = "5";
        product.price = "1300";
        product.brand = "Carrier";
        productList.add(product);

        product = new Product();
        product.productNumber = "24ANB636A003";
        product.productDescription = "3 Ton 16 SEER Residential Air Conditioner Condensing Unit";
        product.availability = "2";
        product.price = "1400";
        product.brand = "Carrier";
        productList.add(product);

        product = new Product();
        product.productNumber = "24ACC630A003";
        product.productDescription = " 2.5 Ton 16 SEER Residential Air Conditioner Condensing Unit";
        product.availability = "0";
        product.price = "1500";
        product.brand = "Carrier";
        productList.add(product);

        product = new Product();
        product.productNumber = "24ANB736A003";
        product.productDescription = " 3 Ton 17 SEER Residential 2-Stage Air Conditioner Condensing Unit";
        product.availability = "9";
        product.price = "1600";
        product.brand = "Carrier";
        productList.add(product);

        product = new Product();
        product.productNumber = "24ANB148A003";
        product.productDescription = "4 Ton Residential Air Conditioner Condensing Unit 2-Stage";
        product.availability = "20";
        product.price = "2800";
        product.brand = "Carrier";
        productList.add(product);

        return productList;
    }
}
