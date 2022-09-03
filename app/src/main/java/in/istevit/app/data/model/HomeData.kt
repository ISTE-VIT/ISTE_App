package `in`.istevit.app.data.model

data class CarouselData(
    val image: String,
    val title: String,
    val link: String
)

data class AnnouncementsData(
    val image: String,
    val title: String,
    val description: String,
    val author: String,
    val link: String,
    val type: String
)