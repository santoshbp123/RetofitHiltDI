package com.example.retrofithilt.retrofit

import com.example.retrofithilt.model.ProductItem
import retrofit2.Response
import retrofit2.http.GET

interface MyApi {
    @GET("/products")
    suspend fun doNetworkCall(): Response<List<ProductItem>>
}