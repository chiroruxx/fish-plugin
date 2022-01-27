package com.github.chiroruxx.fishplugin.services

import com.intellij.openapi.project.Project
import com.github.chiroruxx.fishplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
