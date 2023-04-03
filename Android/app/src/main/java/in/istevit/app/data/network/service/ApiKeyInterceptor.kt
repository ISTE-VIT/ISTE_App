package `in`.istevit.app.data.network.service

import `in`.istevit.app.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()
        builder.addHeader("api_key", BuildConfig.API_KEY)
        return chain.proceed(builder.build())
    }
}