package com.github.gervant08.mvimodulegenerator.services

import com.intellij.openapi.project.Project
import com.github.gervant08.mvimodulegenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
