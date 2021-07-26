package com.yalonso.interview.domain.models

import com.google.gson.annotations.SerializedName

data class ProductResponse (
    @SerializedName("data") val productData: ProductData
)