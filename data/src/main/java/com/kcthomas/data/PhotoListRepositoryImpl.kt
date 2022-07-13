package com.kcthomas.data

import com.kcthomas.domain.PhotoListRepository
import com.kcthomas.domain.PhotoListResponse
//import javax.inject.Inject

class PhotoListRepositoryImpl (
    private val remoteSource: RemotePhotoListSource
    // TODO - Add a Cached source
): PhotoListRepository {
//class PhotoListRepositoryImpl @Inject constructor(
//    private val remoteSource: RemotePhotoListSource
//    // TODO - Add a Cached source
//): PhotoListRepository {

    override fun getPhotoList(): PhotoListResponse? {
        TODO("Not yet implemented")
    }

}
