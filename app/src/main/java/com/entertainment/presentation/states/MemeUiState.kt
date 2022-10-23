package com.entertainment.presentation.states

import com.entertainment.models.MemeModel


data class MemeUiState(
    override val id: String = "",
    val memesList: List<MemeModel> = emptyList(),
    val isLoading: Boolean = false
) : State

