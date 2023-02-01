package teka.mobile.gameheadv2.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import teka.mobile.gameheadv2.ui.screens.DetailScreen
import teka.mobile.gameheadv2.ui.screens.HomeScreen
import teka.mobile.gameheadv2.ui.vm.GameViewModel
import teka.mobile.gameheadv2.util.Constants.Companion.KEY_GAME_ID
import teka.mobile.gameheadv2.util.Constants.Screens.DETAIL_SCREEN
import teka.mobile.gameheadv2.util.Constants.Screens.HOME_SCREEN


sealed class Screens( val route: String) {

    object Home: Screens(route = HOME_SCREEN)
    object Detail: Screens(route = DETAIL_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController, gameViewModel: GameViewModel){

    NavHost(navController = navController, startDestination = Screens.Home.route){

        composable(route = Screens.Home.route){

            HomeScreen(gameViewModel = gameViewModel, navController = navController)

        }
        
        composable(route = Screens.Detail.route + "/{$KEY_GAME_ID}"){ backStackEntry ->
            DetailScreen(id = backStackEntry.arguments?.getString(KEY_GAME_ID) ?: "1",
                gameViewModel = gameViewModel,
                navController = navController
            )
            
        }

    }

}