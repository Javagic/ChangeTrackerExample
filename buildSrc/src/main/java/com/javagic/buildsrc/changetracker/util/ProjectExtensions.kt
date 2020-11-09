package com.javagic.buildsrc.changetracker.util

import com.javagic.buildsrc.changetracker.ChangeTrackerExtension
import org.gradle.api.Project
import java.lang.Exception

val Project.isRoot get() = this == rootProject

@Suppress("UNCHECKED_CAST")
fun <T> Project.getExtraProperty(key: String): T? = try {
    extensions.extraProperties[key] as T?
} catch (error: Exception) {
    null
}

val Project.changeTrackerExtension: ChangeTrackerExtension
    get() = extensions.getByName(CHANGE_TRACKER_EXTENSION) as ChangeTrackerExtension