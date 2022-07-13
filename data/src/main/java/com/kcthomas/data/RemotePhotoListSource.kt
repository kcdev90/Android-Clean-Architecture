package com.kcthomas.data

//import javax.inject.Inject

class RemotePhotoListSource (private val api: PhotoListApi) {
//class RemotePhotoListSource @Inject constructor(private val api: PhotoListApi) {

    fun getPhotoList() = api.getPhotoList()

}
