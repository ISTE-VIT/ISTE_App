package `in`.istevit.app.ui.resources

import `in`.istevit.app.data.model.resources.OpenGraphResult
import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import `in`.istevit.app.data.model.resources.ResourcesOgpData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jsoup.Jsoup

class OgpViewModel : ViewModel() {
    private var resLinks = mutableListOf<OpenGraphResult>()
    private var resTopics = mutableListOf<ResourcesOgpData>()
    var ogpLiveData = MutableLiveData<List<ResourcesOgpData>>()

    fun fetchOgpData(resData: ResourcesDetailModel) {
        viewModelScope.launch(Dispatchers.IO) {
            for (x in resData.topics) {
                resLinks.clear()
                for (y in x.links) {
                    val openGraphResult = OpenGraphResult()
                    try {
                        val response = Jsoup.connect(y)
                            .ignoreContentType(true)
                            .userAgent("Mozilla")
                            .referrer("http://www.google.com")
                            .timeout(100000)
                            .followRedirects(true)
                            .get()
                        val ogTags = response.select("meta[property^=og:]")
                        when {
                            ogTags.size > 0 ->
                                ogTags.forEachIndexed { index, _ ->
                                    val tag = ogTags[index]
                                    when (tag.attr("property")) {
                                        "og:title" -> {
                                            openGraphResult.title = tag.attr("content")
                                        }
                                        "og:description" -> {
                                            openGraphResult.description = tag.attr("content")
                                        }
                                        "og:image" -> {
                                            openGraphResult.image = tag.attr("content")
                                        }
                                        "og:url" -> {
                                            openGraphResult.url = tag.attr("content")
                                        }
                                        "og:site_name" -> {
                                            openGraphResult.siteName = tag.attr("content")
                                        }
                                        "og:type" -> {
                                            openGraphResult.type = tag.attr("content")
                                        }
                                    }
                                }
                        }
                        resLinks.add(openGraphResult)
                    } catch (e: Exception) {
                        val emptyList: List<ResourcesOgpData> = listOf()
                        ogpLiveData.postValue(emptyList)
                        e.printStackTrace()
                    }
                }
                resTopics.add(ResourcesOgpData(topic = x.topic, links = resLinks))
            }
            ogpLiveData.postValue(resTopics)
        }
    }
}