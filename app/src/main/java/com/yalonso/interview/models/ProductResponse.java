package com.yalonso.interview.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductResponse {
    @SerializedName("data")
    @Expose
    public ProductData productData;
}
