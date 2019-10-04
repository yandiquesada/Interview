package com.yalonso.interview.controllers;

import com.yalonso.interview.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsController {
    private static ProductDetailsController productControllerInstance;
    public Product product;

    public static ProductDetailsController getInstance() {
        if (productControllerInstance == null) {
            productControllerInstance = new ProductDetailsController();
        }
        return productControllerInstance;
    }
}
