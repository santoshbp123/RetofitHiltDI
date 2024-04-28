package com.example.retrofithilt.repository

import com.example.retrofithilt.model.ProductItem
import retrofit2.Response

interface MyRepository {

    suspend fun doNetworkCal() : Response<List<ProductItem>>
}