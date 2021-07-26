package com.yalonso.interview.domain.models

import com.google.gson.annotations.SerializedName

data class ProductData (
    @SerializedName("num_found") val numberOfRecords: Int,
    @SerializedName("products") val products: ArrayList<Product>
)
