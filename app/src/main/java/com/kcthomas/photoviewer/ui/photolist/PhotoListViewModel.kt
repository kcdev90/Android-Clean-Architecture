package com.kcthomas.photoviewer.ui.photolist

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kcthomas.core.LoadState
import com.kcthomas.domain.Photo
import com.kcthomas.domain.PhotoListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PhotoListViewModel @Inject constructor(
    private val repository: PhotoListRepository
) : ViewModel() {

    data class ViewState(val photoList: List<Photo>)

    private val _viewState = MutableStateFlow<LoadState<ViewState>>(LoadState.InFlight)
    val viewState = _viewState.asStateFlow()

    init {
        loadPhotoList()
    }

    private fun loadPhotoList() {
        viewModelScope.launch {
            _viewState.update { LoadState.InFlight }
            repository.getPhotoList().let { response ->
                if (response == null) {
                    Log.e(PhotoListViewModel::class.java.simpleName, "Failed to load Photos")
                    _viewState.update { LoadState.Error }
                } else {
                    _viewState.update {
                        LoadState.Success(
                            ViewState(photoList = response.photoList)
                        )
                    }
                }
            }
        }
    }

}
