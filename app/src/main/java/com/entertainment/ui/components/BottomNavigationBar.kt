package com.entertainment.ui.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.entertainment.ui.BottomNavigationItem

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navigationItems = listOf(
        BottomNavigationItem.Joke,
        BottomNavigationItem.Meme,
        BottomNavigationItem.AnimeQuotes
    )
    BottomAppBar(
        modifier = Modifier,
        backgroundColor = MaterialTheme.colors.primarySurface,
        contentColor = contentColorFor(SnackbarDefaults.backgroundColor),
        cutoutShape = null,
        elevation = AppBarDefaults.BottomAppBarElevation,
        contentPadding = AppBarDefaults.ContentPadding,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        navigationItems.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route)
                    }
                }
            )
        }
    }
}