package com.kcthomas.data

import com.kcthomas.domain.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoListApi {

    @GET("v2/list")
    fun getPhotoList(): Call<PhotoList>

}
