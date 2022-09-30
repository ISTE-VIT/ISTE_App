package `in`.istevit.app.data.model.resources

data class ResourcesDetailModel(
    val _id: String? = null,
    val title: String,
    val roadmap: String,
    val topics: List<ResourcesLinksData>
)
