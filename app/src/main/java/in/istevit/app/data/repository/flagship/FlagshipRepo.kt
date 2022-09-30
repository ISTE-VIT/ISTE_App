package `in`.istevit.app.data.repository.flagship

import `in`.istevit.app.data.model.FlagshipModel
import retrofit2.Response
import retrofit2.http.GET

interface FlagshipRepo {
    @GET("/flagship/")
    suspend fun getFlagshipEvents(): Response<List<FlagshipModel>>
}