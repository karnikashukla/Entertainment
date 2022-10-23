package com.entertainment.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.entertainment.models.AnimeQuoteModel
import com.entertainment.presentation.states.AnimeUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class AnimeQuoteViewModel: ViewModel() {
    val state = MutableStateFlow(AnimeUiState())
    init {
        // TODO temporarily added fake data , to be deleted when we add usecase
        val animeQuoteList: List<AnimeQuoteModel> = arrayListOf(
            AnimeQuoteModel("ada sc sh shbh basdh bds ", "said by", "from Anime"),
            AnimeQuoteModel("sjkf hasusda fd", "skhf bak", "ssdfas"),
            AnimeQuoteModel("saavadsvsdv bfsab", "sadv", "ljihuifas"),
            AnimeQuoteModel("s fdvdsv dv", "asd ", "uyghjbui"),
            AnimeQuoteModel("sd gsag bhnhs gs", "hnd", "jhuoishjsd"),
            AnimeQuoteModel("asfk nvajhvsj s vjbaskdjvb", "enfdb", "mnuguy")
        )
        state.update {
            it.copy(animeQuoteList = animeQuoteList)
        }
    }
}