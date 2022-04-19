package com.yalonso.interview.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("brand")
    @Expose
    public String brand = "";

    @SerializedName("title")
    @Expose
    public String title = "";

    @SerializedName("mpn")
    @Expose
    public String mpn = "";

    @SerializedName("image_url")
    @Expose
    public String imageUrl = "";

    @SerializedName("inventory")
    @Expose
    public String inventory = "";

    @SerializedName("item_id")
    @Expose
    public String itemId = "";

    @SerializedName("heiler_num")
    @Expose
    public String heilerNum = "";

    @SerializedName("product_type")
    @Expose
    public String productType = "";

    @SerializedName("product_id")
    @Expose
    public String id = "";

    @SerializedName("has_supersedes")
    @Expose
    public String has_supersedes = "";

    @SerializedName("product_num")
    @Expose
    public String productNumber = "";


}
