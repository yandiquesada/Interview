package com.yalonso.interview.data

import android.content.Context
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset
import com.google.gson.Gson
import com.yalonso.interview.domain.models.ProductResponse


class ProductRepository {

    fun getProducts(context: Context): ProductResponse {
        val jsonData = loadJSONFromAsset(context)
        return Gson().fromJson(jsonData, ProductResponse::class.java)
    }

    private fun loadJSONFromAsset(context: Context): String? {
        var json: String? = null
        json = try {
            val inputStream: InputStream = context.assets.open("products.json")
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            val jsonData = String(buffer, Charset.forName("UTF-8"))
            return jsonData
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }
}