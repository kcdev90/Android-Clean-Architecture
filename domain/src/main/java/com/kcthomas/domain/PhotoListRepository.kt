package com.kcthomas.domain

interface PhotoListRepository {

    // return null if network/server error
    fun getPhotoList(): PhotoList?

}
