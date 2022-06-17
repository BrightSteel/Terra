repositories {
    maven { url = uri("https://jitpack.io/") }
}

dependencies {
    shadedApi("commons-io:commons-io:${Versions.CLI.commonsIO}")
    shadedApi("com.github.Querz:NBT:${Versions.CLI.nbt}")
    shadedApi(project(":common:implementation:base"))
    
    shadedImplementation("com.google.guava:guava:31.0.1-jre")
    
    shadedImplementation("ch.qos.logback:logback-classic:${Versions.CLI.logback}")
    
    implementation("net.jafama", "jafama", Versions.Libraries.Internal.jafama)
}

tasks.withType<Jar>() {
    entryCompression = ZipEntryCompression.STORED
    manifest {
        attributes(
            "Main-Class" to "com.dfsek.terra.cli.TerraCLI",
                  )
    }
}