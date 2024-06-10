package com.example.mymusic

import androidx.annotation.StringRes
import androidx.navigation.compose.NavHost
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

enum class AppScreens(@StringRes val screenTitle: Int) {
    AlbumList(screenTitle = R.string.your_albums),
    SongList(screenTitle = R.string.songs),
    Song(screenTitle = R.string.song_name),
    SongDetail(screenTitle = R.string.song_details)
}

@Composable
fun MusicApp(
    viewModel: OrderViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
    //...
    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = AppScreens.SongList.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = AppScreens.SongList.name) {
                StartOrderScreen(
                    quantityOptions = DataSource.quantityOptions,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(dimensionResource(R.dimen.padding_medium))
                )
            }
            composable(route = AppScreens.AlbumList.name) {
                val context = LocalContext.current
            }
        }
    }
}


