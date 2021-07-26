package com.yalonso.interview.domain.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product (
    @SerializedName("mpn") var productNumber: String = "",
    @SerializedName("title") var productDescription: String = "",
    @SerializedName("price") var price: String = "9999",
    @SerializedName("inventory") var availability: String = "",
    @SerializedName("image_url") var imageUrl: String = "",
    var brand: String = "Carrier"
): Parcelable

