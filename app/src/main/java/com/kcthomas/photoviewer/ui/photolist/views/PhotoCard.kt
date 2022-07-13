package com.kcthomas.photoviewer.ui.photolist.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
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
        Column {
            Row(Modifier.padding(8.dp)) {
                Image(
                    painter = rememberAsyncImagePainter(photo.url),
                    contentDescription = stringResource(com.kcthomas.core.R.string.photo),
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
                )

                Spacer(Modifier.width(8.dp))

                Text(
                    text = photo.author
                )
            }
        }

        Divider()
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
