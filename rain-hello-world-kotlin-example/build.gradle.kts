plugins {
    id("rain-hello-world.kotlin")
    application
}

dependencies {
    implementation(project(":rain-hello-world-kotlin-core"))
    implementation(project(":rain-hello-world-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :rain-hello-world-kotlin-example:run` to run `Main`
    // Use `./gradlew :rain-hello-world-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.rain_hello_world.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
