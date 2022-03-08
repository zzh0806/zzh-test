package com.github.zzh0806.zzhtest.services

import com.intellij.openapi.project.Project
import com.github.zzh0806.zzhtest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
