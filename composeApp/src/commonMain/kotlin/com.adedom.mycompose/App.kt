package com.adedom.mycompose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.adedom.mycompose.presentation.detail.component.DetailScreen
import com.adedom.mycompose.presentation.home.component.HomeScreen
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun App(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home",
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        composable(route = "home") {
            HomeScreen(
                modifier = Modifier.fillMaxSize(),
                homeViewModel = koinViewModel(),
                onCardClick = { id ->
                    navController.navigate("detail/$id")
                },
            )
        }
        composable(
            route = "detail/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType }),
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id")
            DetailScreen(
                modifier = Modifier.fillMaxSize(),
                id = id,
                detailViewModel = koinViewModel(),
                onBackPressed = navController::popBackStack,
            )
        }
    }
}
