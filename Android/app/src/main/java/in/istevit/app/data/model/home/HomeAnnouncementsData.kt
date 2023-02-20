package `in`.istevit.app.data.model.home

data class HomeAnnouncementsData(
    val _id: String,
    val author: String,
    val category: String,
    val date: String,
    val description: String,
    val image: String,
    val link: String? = null,
    val platform: String?,
    val time: String?,
    val title: String,
    val type: String,
    val filter: String?
)