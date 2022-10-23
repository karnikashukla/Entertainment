package com.entertainment.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.entertainment.R
import com.entertainment.presentation.viewmodels.AnimeQuoteViewModel

// use api https://animechan.vercel.app/api/quotes
@Composable
fun AnimeQuotesScreen(
    animeQuoteViewModel: AnimeQuoteViewModel = AnimeQuoteViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        val screenState = animeQuoteViewModel.state.collectAsState()
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(screenState.value.animeQuoteList) { quote ->
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    shape = RoundedCornerShape(8.dp),
                    elevation = 2.dp
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_baseline_format_quote_24),
                                contentDescription = "",
                                colorFilter = ColorFilter.tint(color = Color.Gray)
                            )
                        }

                        Column(
                            modifier = Modifier
                                .padding(10.dp)
                        ) {
                            Text(text = quote.quote, style = TextStyle(fontSize = 20.sp))
                            Row {
                                Text(
                                    text = "- " + quote.saidBy,
                                    style = TextStyle(fontSize = 18.sp)
                                )
                                Text(
                                    text = ", " + quote.fromAnime,
                                    style = TextStyle(fontSize = 18.sp)
                                )
                            }
                        }

                    }
                }
            }
        }
    }
}
