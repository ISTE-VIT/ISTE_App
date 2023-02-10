package `in`.istevit.app.data.model

import java.io.Serializable

data class BlogDetailsModel(
    val _id: String? = null,
    val date: String,
    val description: String,
    val filter: String? = null,
    val image: String,
    val link: String,
    val title: String,
    val writer: String
): Serializable
