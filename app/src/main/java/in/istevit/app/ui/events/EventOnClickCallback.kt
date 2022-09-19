package `in`.istevit.app.ui.events

import `in`.istevit.app.data.model.EventDetailsModel

interface EventOnClickCallback {
    fun onClick(item: EventDetailsModel)
}