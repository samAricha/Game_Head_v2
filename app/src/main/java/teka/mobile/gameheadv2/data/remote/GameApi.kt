package teka.mobile.gameheadv2.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import teka.mobile.gameheadv2.data.remote.models.GameModel
import teka.mobile.gameheadv2.data.remote.models.SpecificGameModel
import teka.mobile.gameheadv2.util.Constants.Companion.GAMES_ENDPOINT
import teka.mobile.gameheadv2.util.Constants.Companion.GAME_ID_ENDPOINT

interface GameApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>

    @GET(GAME_ID_ENDPOINT)
    suspend fun getGameById(@Query(value = "id") id: Int): Response<SpecificGameModel>
}