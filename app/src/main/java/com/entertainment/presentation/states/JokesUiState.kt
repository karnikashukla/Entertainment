package com.entertainment.presentation.states

import com.entertainment.models.JokeModel

data class JokesUiState(
    override val id: String = "",
    val jokesList: List<JokeModel> = emptyList(),
    val isLoading: Boolean = false
) : State
