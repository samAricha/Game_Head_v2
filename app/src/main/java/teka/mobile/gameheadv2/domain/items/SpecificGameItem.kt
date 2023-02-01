package teka.mobile.gameheadv2.domain.items

import teka.mobile.gameheadv2.data.remote.models.SpecificGameModel

data class SpecificGameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val description: String

)

fun SpecificGameModel.toSpecificItem() = SpecificGameItem(id, title, thumbnail, description)
