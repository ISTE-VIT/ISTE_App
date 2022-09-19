package `in`.istevit.app.data.repository.events

import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.data.network.service.RetrofitService
import android.util.Log
import java.net.UnknownHostException

private const val TAG = "EventsRepoImpl"

class EventsRepoImpl {
    private val service = RetrofitService.getRetroInstance().create(EventsRepo::class.java)

    suspend fun fetchEventsData(): Result<List<EventDetailsModel>>{
        return try {
            val response = service.getEvents()
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Log.d(TAG, response.message())
                Result.failure(Exception(response.errorBody().toString()))
            }
        } catch (e: UnknownHostException) {
            Log.e(TAG, e.stackTraceToString())
            Result.failure(e)
        } catch (e: Exception){
            Log.e(TAG, e.stackTraceToString())
            Result.failure(e)
        }
    }
}