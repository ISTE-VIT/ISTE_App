package `in`.istevit.app.data.repository.events

import `in`.istevit.app.data.model.EventDetailsModel
import retrofit2.Response
import retrofit2.http.GET

interface EventsRepo {
    @GET("/events/all/")
    suspend fun getEvents(): Response<List<EventDetailsModel>>
}