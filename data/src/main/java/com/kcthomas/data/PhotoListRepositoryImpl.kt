package com.kcthomas.data

import android.util.Log
import com.kcthomas.domain.PhotoListRepository
import com.kcthomas.domain.PhotoList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PhotoListRepositoryImpl(
    private val remoteSource: RemotePhotoListSource
    // TODO - Add a Cached source
) : PhotoListRepository {

    override fun getPhotoList(): PhotoList? {
        remoteSource.getPhotoList().enqueue(object : Callback<PhotoList> {
            override fun onResponse(call: Call<PhotoList>, response: Response<PhotoList>) {
                if (response.isSuccessful && response.body() != null) {
                    Log.e("t", "success")
                } else {
                    Log.e("t", "server error")
                }
            }

            override fun onFailure(call: Call<PhotoList>, t: Throwable) {
                Log.e("t", "success")
            }
        })
        return null
    }

}
