package com.entertainment.presentation.states

import com.entertainment.models.AnimeQuoteModel


data class AnimeUiState(
    override val id: String = "",
    val animeQuoteList: List<AnimeQuoteModel> = emptyList(),
    val isLoading: Boolean = false
):State
