package com.entertainment.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.entertainment.models.JokeModel
import com.entertainment.presentation.states.JokesUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class JokesViewModel : ViewModel() {
    val state = MutableStateFlow(JokesUiState())

    init {
        // TODO temporarily added fake data , to be deleted when we add usecase
        val jokesList: List<JokeModel> = arrayListOf(
            JokeModel("ada sc sh shbh basdh bds ", " ssdds", true),
            JokeModel("sjkf hasusda fd", "skhf bak", true),
            JokeModel("saavadsvsdv bfsab", "sadv", true),
            JokeModel("s fdvdsv dv", "asd ", true),
            JokeModel("sd gsag bhnhs gs", "hnd", true),
            JokeModel("asfk nvajhvsj s vjbaskdjvb", "enfdb", true)
        )
        state.update {
            it.copy(jokesList = jokesList)
        }
    }
}