package com.entertainment.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.entertainment.presentation.viewmodels.JokesViewModel

// use api https://v2.jokeapi.dev/joke/Any?type=single&amount=5
@Composable
fun JokeScreen(
    // TODO to be moved to hilt viewmodel
    jokesViewModel: JokesViewModel = JokesViewModel()
) {
    val screenState = jokesViewModel.state.collectAsState()
    // TODO @ks to be moved to lazy column , and improve ui
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart)
    ) {
        screenState.value.jokesList.forEach {
            Spacer(modifier = Modifier.height(12.dp))
            Card {
                Column {
                    Text(text = it.joke)
                    Text(text = it.jokeCategory)
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }
}