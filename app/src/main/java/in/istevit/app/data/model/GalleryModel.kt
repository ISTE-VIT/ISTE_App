package `in`.istevit.app.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GalleryModel(
    @PrimaryKey
    val _id: String,
    val image: String
)
