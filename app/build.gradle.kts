plugins {
    id("edu.vanderbilt.isis.mesolab.application")
}

application {
    mainModule.set("edu.vanderbilt.isis.mesolab.symcps.app")
    mainClass.set("edu.vanderbilt.isis.mesolab.symcps.app.Application")
}

dependencies {
    javaModuleDependencies {
        runtimeOnly(ga("org.slf4j.simple"))
    }
}
