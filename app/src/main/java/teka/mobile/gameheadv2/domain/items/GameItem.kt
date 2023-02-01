package teka.mobile.gameheadv2.domain.items

import teka.mobile.gameheadv2.data.remote.models.GameModel

data class GameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String

)

fun GameModel.toGameItem() = GameItem(id, title, thumbnail, short_description)
