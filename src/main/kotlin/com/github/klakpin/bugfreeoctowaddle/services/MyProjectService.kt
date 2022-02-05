package com.github.klakpin.bugfreeoctowaddle.services

import com.intellij.openapi.project.Project
import com.github.klakpin.bugfreeoctowaddle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
