package `in`.istevit.app.ui.blogs

import `in`.istevit.app.data.model.BlogDetailsModel

interface BlogOnCLickCallback {
    fun onClick(item: BlogDetailsModel)
}