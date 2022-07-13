package com.kcthomas.data

import com.kcthomas.domain.Photo
import com.kcthomas.domain.PhotoListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PhotoListRepositoryImpl(
    private val remoteSource: RemotePhotoListSource
    // TODO - Add a Cached source
) : PhotoListRepository {

    override suspend fun getPhotoList(): List<Photo>? = withContext(Dispatchers.IO) {
        remoteSource.getPhotoList()
    }

}
