package `in`.istevit.app.data.model

import java.io.Serializable

data class EventDetailsModel(
    val _id: String? = null,
    val category: String,
    val date: String,
    val description: String,
    val filter: String? = null,
    val image: String,
    val link: String? = null,
    val platform: String,
    val speaker: String,
    val time: String,
    val title: String
): Serializable
