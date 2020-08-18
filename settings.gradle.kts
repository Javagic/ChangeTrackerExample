import java.util.Properties

include(":app")
//rootProject.name = "My Application"

file("features").safeListFiles { dir ->
    include("features-${dir.name}")
    project(":features-${dir.name}").projectDir = dir
}


fun File.safeListFiles(onDirectory: (File) -> Unit) {
    this.listFiles { dir ->
        !dir.endsWith(".DS_Store")
    }?.forEach {
        onDirectory(it)
    }
}
