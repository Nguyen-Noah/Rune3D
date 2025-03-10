plugins {
    kotlin("jvm")
    application
}

repositories {
    mavenCentral()
}

val imguiVersion = "1.89.0"
val glmVersion = "0.9.9.1-12"
val koolVersion = "0.9.79"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":Rune"))

    // imgui
    implementation("io.github.spair:imgui-java-app:${imguiVersion}")

    // glm
    implementation("io.github.kotlin-graphics:glm:${glmVersion}")
    implementation("io.github.kotlin-graphics:kool:${koolVersion}")
}

sourceSets {
    main {
        kotlin {
            setSrcDirs(listOf("src"))
        }
    }
}

application {
    mainClass.set("MainKt")
}
