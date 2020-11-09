plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
//    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.72")

    implementation("org.eclipse.jgit:org.eclipse.jgit:5.4.0.201906121030-r")
}

gradlePlugin {
    plugins {
        register("ChangeTrackerPlugin") {
            id = "ChangeTrackerPlugin"
            implementationClass = "com.javagic.buildsrc.changetracker.ChangeTrackerPlugin"
        }
    }
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}