package teka.mobile.gameheadv2.repo

import teka.mobile.gameheadv2.data.remote.GameService
import teka.mobile.gameheadv2.domain.items.GameItem
import teka.mobile.gameheadv2.domain.items.SpecificGameItem
import teka.mobile.gameheadv2.domain.items.toGameItem
import teka.mobile.gameheadv2.domain.items.toSpecificItem
import javax.inject.Inject


class GameRepository @Inject constructor(private val gameService: GameService){

    //this function returns GameItem
    suspend fun getGames(): List<GameItem> {

        return gameService.getGames().map {
            it.toGameItem()
        }

    }


    //this function returns SpecificGameItem
    suspend fun getGameById(id: Int): SpecificGameItem {

        return gameService.getGameById(id).toSpecificItem()

    }



}