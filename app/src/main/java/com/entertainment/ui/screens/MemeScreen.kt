package com.entertainment.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.entertainment.R
import com.entertainment.presentation.viewmodels.MemeViewModel

// use api https://meme-api.herokuapp.com/gimme/10
@Composable
fun MemeScreen(
    memeViewModel: MemeViewModel = MemeViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        val screenState = memeViewModel.state.collectAsState()
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(screenState.value.memesList) { meme ->
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    shape = RoundedCornerShape(8.dp),
                    elevation = 2.dp
                ) {
                    Column(
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(
                            text = meme.title,
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier.padding(10.dp)
                        )
                        AsyncImage(
                            model = ImageRequest.Builder(
                                LocalContext.current
                            ).data(data = meme.url).crossfade(true).build(),
                            contentDescription = stringResource(
                                R.string.meme_image
                            ),
                            placeholder = painterResource(id = R.drawable.ic_baseline_photo_library_24),
                            contentScale = ContentScale.Fit,
                            modifier = Modifier.padding(10.dp)
                        )
                    }

                }
            }
        }
    }
}
