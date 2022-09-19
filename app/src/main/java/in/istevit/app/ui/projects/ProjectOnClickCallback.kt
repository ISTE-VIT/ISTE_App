package `in`.istevit.app.ui.projects

import `in`.istevit.app.data.model.ProjectsModel

interface ProjectOnClickCallback {
    fun onProjectClick(item: ProjectsModel)
}