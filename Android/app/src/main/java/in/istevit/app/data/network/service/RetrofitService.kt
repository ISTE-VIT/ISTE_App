package `in`.istevit.app.data.network.service

import `in`.istevit.app.BuildConfig
import com.localebro.okhttpprofiler.OkHttpProfilerInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    companion object {
        fun getRetroInstance(): Retrofit {
            val client = OkHttpClient.Builder()
                .addInterceptor(OkHttpProfilerInterceptor())
                .build()

            return Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
        }
    }
}