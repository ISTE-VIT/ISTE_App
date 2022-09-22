package `in`.istevit.app.data.model

import java.io.Serializable

data class FlagshipModel(
    val eventName: String,
    val image: String,
    val description: String,
    val tracks: List<String>
): Serializable
