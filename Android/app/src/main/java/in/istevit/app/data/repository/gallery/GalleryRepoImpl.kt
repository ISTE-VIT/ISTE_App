package `in`.istevit.app.data.repository.gallery

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import `in`.istevit.app.data.database.ImagesDao
import `in`.istevit.app.data.network.service.CommonNetworkService
import android.util.Log
import java.net.UnknownHostException
import javax.inject.Inject

private const val TAG = "GalleryRepoImpl"

class GalleryRepoImpl @Inject constructor(
    private val dao: ImagesDao,
    private val service: CommonNetworkService,
    context: Context
) {

    private val ai: ApplicationInfo = context.packageManager
        .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
    private val value = ai.metaData["API_KEY"]
    private val key = value.toString()

    suspend fun fetchGalleryData() {
        try {
            val response = service.getGallery(key)
            if (response.isSuccessful) {
                dao.insertAll(response.body()!!)
            } else {
                Log.d(TAG, response.message())
            }
        } catch (e: UnknownHostException) {
            Log.e(TAG, e.stackTraceToString())
        } catch (e: Exception) {
            Log.e(TAG, e.stackTraceToString())
        }
    }

    fun getGalleryData() = dao.getAllImages()
}