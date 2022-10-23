package com.entertainment.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.entertainment.JokeModel
import com.entertainment.presentation.states.JokesUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class JokesViewModel : ViewModel() {
    val state = MutableStateFlow(JokesUiState())

    init {
        // TODO temporarily added fake data , to be deleted when we add usecase
        val jokesList: List<JokeModel> = arrayListOf(
            JokeModel("ada sc sh shbh basdh bds "," ssdds"),
            JokeModel("sjkf hasusda fd","skhf bak"),
            JokeModel("saavadsvsdv bfsab","sadv"),
            JokeModel("s fdvdsv dv","asd "),
            JokeModel("sd gsag bhnhs gs","hnd"),
            JokeModel("asfk nvajhvsj s vjbaskdjvb","enfdb"),
        )
        state.update {
            it.copy(jokesList = jokesList)
        }
    }
}