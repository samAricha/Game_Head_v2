package teka.mobile.gameheadv2.data.remote

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import teka.mobile.gameheadv2.data.remote.models.GameModel
import teka.mobile.gameheadv2.data.remote.models.SpecificGameModel
import javax.inject.Inject


class GameService @Inject constructor(private val gameApi: GameApi){

    suspend fun getGames(): List<GameModel> {

        return withContext(Dispatchers.IO) {
            val games = gameApi.getGames()
            games.body() ?: emptyList()
        }

    }

    suspend fun getGameById(id: Int): SpecificGameModel {

        return withContext(Dispatchers.IO){
            val game = gameApi.getGameById(id)
            game.body()!!
        }

    }

}