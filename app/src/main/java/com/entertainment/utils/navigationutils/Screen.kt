package com.entertainment.utils.navigationutils

sealed class Screen(open val route: String) : SealedState {
    data class None(override val route: String = "") : Screen(route)
    data class Jokes(override val route: String = "jokes") : Screen(route)
    data class Memes(override val route: String = "memes") : Screen(route)
    data class AnimeQuotes(override val route: String = "anime_quotes") : Screen(route)
}