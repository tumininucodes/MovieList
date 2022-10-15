package com.tumininu.movielist.presentation.ui.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage
import com.tumininu.movielist.R
import com.tumininu.movielist.model.Movie

@Composable
fun MovieView(movie: Movie, modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(top = 8.dp, bottom = 8.dp)) {
        Column(modifier = modifier
            .width(120.dp)
            .padding(0.dp)) {
            GlideImage(
                imageModel = "https://image.tmdb.org/t/p/original" + movie.poster_path,
                imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                modifier = modifier
                    .width(125.dp)
                    .height(200.dp)
                    .align(Alignment.CenterHorizontally),
                previewPlaceholder = R.drawable.image,
            )
            Spacer(modifier = modifier.height(8.dp))
            Text(
                text = movie.title,
                fontSize = 11.sp,
                maxLines = 1,
                modifier = modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 8.dp)
            )
            Spacer(modifier = modifier.height(8.dp))
        }
    }
}

//@Preview
//@Composable
//fun ComposablePreview() {
//    MovieView()
//}