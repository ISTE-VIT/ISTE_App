package `in`.istevit.app.data.model

import java.io.Serializable

data class FlagshipModel(
    val _id: String? = null,
    val description: String,
    val eventName: String,
    val image: String,
    val tracks: List<String>?,
    val gallery: List<String>?
): Serializable
