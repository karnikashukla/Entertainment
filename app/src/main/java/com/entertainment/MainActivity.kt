package com.entertainment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.navigation.compose.rememberNavController
import com.entertainment.ui.components.BottomNavigationBar
import com.entertainment.utils.navigationutils.NavigationGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = getString(R.string.app_name)) }
                    )
                },
                bottomBar = { BottomNavigationBar(navController) }
            ) {
                NavigationGraph(navController)
            }
        }
    }

}
