package com.nicolascristaldo.wildecity.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.nicolascristaldo.wildecity.R
import com.nicolascristaldo.wildecity.data.CategoriesDataProvider
import com.nicolascristaldo.wildecity.data.PlaceDataProvider
import com.nicolascristaldo.wildecity.data.WildeCityScreen
import com.nicolascristaldo.wildecity.ui.AppViewModel

@Composable
fun WildeCityApp(
    viewModel: AppViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = WildeCityScreen.valueOf(
        backStackEntry?.destination?.route ?: WildeCityScreen.Start.name
    )

    Scaffold(
        topBar = {
            WildeCityTopAppBar(
                canNavigateBack = navController.previousBackStackEntry != null,
                currentScreen = currentScreen,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = WildeCityScreen.Start.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = WildeCityScreen.Start.name) {
                StartScreen(
                    listItems = CategoriesDataProvider.getCategories(),
                    viewModel = viewModel,
                    onClick = {
                        navController.navigate(WildeCityScreen.PlaceList.name)
                    }
                )
            }
            composable(route = WildeCityScreen.PlaceList.name) {
                StartScreen(
                    listItems = uiState.placeList,
                    viewModel = viewModel,
                    onClick = {
                        navController.navigate(WildeCityScreen.PlaceDetails.name)
                    }
                )
            }
            composable(route = WildeCityScreen.PlaceDetails.name) {
                PlaceDetailScreen(place = uiState.selectedPlace!!)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WildeCityTopAppBar(
    currentScreen: WildeCityScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {Text(text = stringResource(id = currentScreen.title))},
        navigationIcon = {
            if(canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow_back),
                        contentDescription = stringResource(id = R.string.string_arrow_back)
                    )
                }
            }
        }
    )
}


