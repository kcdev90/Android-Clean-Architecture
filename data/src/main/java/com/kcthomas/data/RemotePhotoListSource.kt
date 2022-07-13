package com.kcthomas.data

class RemotePhotoListSource (private val api: PhotoListApi) {

    fun getPhotoList() = api.getPhotoList()

}
