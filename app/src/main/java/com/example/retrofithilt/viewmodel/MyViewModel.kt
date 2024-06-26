package com.example.retrofithilt.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofithilt.model.ProductItem
import com.example.retrofithilt.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {

    val productList : MutableLiveData<Response<List<ProductItem>>> = MutableLiveData()

    fun getProductViewModel(){
        viewModelScope.launch {
            productList.value = repository.doNetworkCal()
        }
    }
}