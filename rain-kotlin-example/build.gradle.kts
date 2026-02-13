plugins {
    id("rain.kotlin")
    application
}

dependencies {
    implementation(project(":rain-kotlin-core"))
    implementation(project(":rain-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :rain-kotlin-example:run` to run `Main`
    // Use `./gradlew :rain-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.rain_sdk.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
