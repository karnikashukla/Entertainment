package com.entertainment.ui.theme

import android.graphics.drawable.Icon
import com.entertainment.R

sealed class BottomNavigationItem(var route: String, var icon: Int, var title: String){
    object Joke: BottomNavigationItem("joke", R.drawable.ic_baseline_emoji_emotions_24,"Jokes")
    object Meme: BottomNavigationItem("meme", R.drawable.ic_baseline_emoji_emotions_24,"Memes")
}
