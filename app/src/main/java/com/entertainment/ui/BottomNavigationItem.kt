package com.entertainment.ui

import com.entertainment.R
import com.entertainment.utils.navigationutils.Screen

sealed class BottomNavigationItem(var route: String, var icon: Int, var title: String) {
    object Joke : BottomNavigationItem(
        Screen.Jokes().route,
        R.drawable.ic_baseline_emoji_emotions_24,
        "Jokes"
    )

    object Meme : BottomNavigationItem(
        Screen.Memes().route,
        R.drawable.ic_baseline_photo_library_24,
        "Memes"
    )

    object AnimeQuotes : BottomNavigationItem(
        Screen.AnimeQuotes().route,
        R.drawable.ic_baseline_format_quote_24,
        "Anime Quotes"
    )
}
