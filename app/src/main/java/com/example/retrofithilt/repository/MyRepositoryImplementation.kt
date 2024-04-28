package com.example.retrofithilt.repository

import com.example.retrofithilt.model.ProductItem
import com.example.retrofithilt.retrofit.MyApi
import retrofit2.Response

class MyRepositoryImplementation(private val api : MyApi) : MyRepository {

    override suspend fun doNetworkCal(): Response<List<ProductItem>> {
      return api.doNetworkCall()
    }


}