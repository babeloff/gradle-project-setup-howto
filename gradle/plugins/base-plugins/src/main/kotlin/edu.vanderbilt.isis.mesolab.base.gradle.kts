plugins {
    id("base")
    id("edu.vanderbilt.isis.mesolab.dependency-rules")
}

// Set the group (some components will be published)
group = "edu.vanderbilt.isis.mesolab.symcps"

// Set the version from 'version.txt'
version = providers.fileContents(
    rootProject.layout.projectDirectory.file("gradle/version.txt")).asText.getOrElse("")
