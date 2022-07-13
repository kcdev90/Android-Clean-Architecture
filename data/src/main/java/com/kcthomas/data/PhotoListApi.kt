package com.kcthomas.data

import com.kcthomas.domain.PhotoListResponse
import retrofit2.Call
import retrofit2.http.GET

interface PhotoListApi {

    @GET("v2/list")
    fun getPhotoList(): Call<PhotoListResponse>

}
