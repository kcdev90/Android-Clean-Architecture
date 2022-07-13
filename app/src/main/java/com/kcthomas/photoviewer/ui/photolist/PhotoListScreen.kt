package com.kcthomas.photoviewer.ui.photolist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.kcthomas.core.compose.PagedLazyColumn

@Composable
fun PhotoListScreen(
    viewModel: PhotoListViewModel = hiltViewModel()
) {
    val pageState by viewModel.pageState.collectAsState()

    PagedLazyColumn(
        pageState = pageState,
        refresh = { viewModel.loadPhotoList(loadNextPage = false) },
        loadNextPage = { viewModel.loadPhotoList(loadNextPage = true) },
    ) {
        pageState.data.forEach { photo ->

        }
    }
}
