package com.entertainment.utils.navigationutils

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.entertainment.ui.screens.AnimeQuotesScreen
import com.entertainment.ui.BottomNavigationItem
import com.entertainment.ui.screens.JokeScreen
import com.entertainment.ui.screens.MemeScreen


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavigationItem.Joke.route) {
        composable(BottomNavigationItem.Joke.route) {
            JokeScreen()
        }
        composable(BottomNavigationItem.Meme.route) {
            MemeScreen()
        }
        composable(BottomNavigationItem.AnimeQuotes.route) {
            AnimeQuotesScreen()
        }
    }
}