package com.entertainment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.entertainment.ui.theme.BottomNavigationItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(topBar = {
                TopAppBar(
                    title = { Text(text = getString(R.string.app_name)) }
                )
            },
                bottomBar = { BottomNavigationBar() },
                content = {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Text(text = getString(R.string.app_name))
                    }
                }
            ) 
        }
    }
}

@Composable
@Preview
fun BottomNavigationBar() {
    val navigationItems = listOf(
        BottomNavigationItem.Joke,
        BottomNavigationItem.Meme
    )
    BottomAppBar(
        modifier = Modifier,
        backgroundColor = MaterialTheme.colors.primarySurface,
        contentColor = contentColorFor(backgroundColor),
        cutoutShape = null,
        elevation = AppBarDefaults.BottomAppBarElevation,
        contentPadding = AppBarDefaults.ContentPadding,
    ) {
        navigationItems.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = false,
                onClick = {}
            )
        }
    }
}