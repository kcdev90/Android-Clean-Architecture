package com.kcthomas.photoviewer.ui.photolist

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun PhotoListScreen (
    viewModel: PhotoListViewModel = hiltViewModel()
) {
    val viewState by viewModel.viewState.collectAsState()
}
