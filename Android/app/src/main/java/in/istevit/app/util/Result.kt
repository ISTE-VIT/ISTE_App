package `in`.istevit.app.util

sealed class Result<T> {
    open class Success<T>(val data: T) : Result<T>()
    open class Error<T>(val exception: Exception) : Result<T>() {
        constructor(data: T) : this(Exception(data.toString()))
        constructor(code: Int, message: String) : this(Exception("$code: $message"))
    }
    open class Loading<T> : Result<T>()
}