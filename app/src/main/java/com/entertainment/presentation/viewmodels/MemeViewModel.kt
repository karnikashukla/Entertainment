package com.entertainment.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.entertainment.models.MemeModel
import com.entertainment.presentation.states.MemeUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class MemeViewModel: ViewModel() {
    val state = MutableStateFlow(MemeUiState())

    init {
        // TODO temporarily added fake data , to be deleted when we add usecase
        val memesList: List<MemeModel> = arrayListOf(
            MemeModel("ada sc sh shbh basdh bds ", "https://api.memegen.link/images/afraid/i_don't_know_what_this_meme_is_for/and_at_this_point_i'm_too_afraid_to_ask.png", false),
            MemeModel("sjkf hasusda fd", "https://api.memegen.link/images/afraid/i_don't_know_what_this_meme_is_for/and_at_this_point_i'm_too_afraid_to_ask.png", false),
            MemeModel("saavadsvsdv bfsab", "https://api.memegen.link/images/afraid/i_don't_know_what_this_meme_is_for/and_at_this_point_i'm_too_afraid_to_ask.png", false),
            MemeModel("s fdvdsv dv", "https://api.memegen.link/images/afraid/i_don't_know_what_this_meme_is_for/and_at_this_point_i'm_too_afraid_to_ask.png", false),
            MemeModel("sd gsag bhnhs gs", "https://api.memegen.link/images/afraid/i_don't_know_what_this_meme_is_for/and_at_this_point_i'm_too_afraid_to_ask.png", false),
            MemeModel("asfk nvajhvsj s vjbaskdjvb", "https://api.memegen.link/images/afraid/i_don't_know_what_this_meme_is_for/and_at_this_point_i'm_too_afraid_to_ask.png", false)
        )
        state.update {
            it.copy(memesList = memesList)
        }
    }
}