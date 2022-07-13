package com.kcthomas.photoviewer.ui.photolist.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kcthomas.core.compose.theme.PhotoViewerTheme
import com.kcthomas.domain.Photo

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PhotoCard(
    photo: Photo,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row() {

        }
    }
}

@Preview
@Composable
fun PreviewPhotoCard() {
    PhotoViewerTheme {
        PhotoCard(
            Photo(
                id = "",
                author = "KC Thomas",
                width = 100,
                height = 100,
                url = "https://unsplash.com/photos/yC-Yzbqy7PY",
                download_url = ""
            )
        ) {}
    }
}
