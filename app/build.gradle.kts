plugins {
    id("edu.vanderbilt.isis.mesolab.application")
}

application {
    mainModule.set("edu.vanderbilt.isis.mesolab.product.app")
    mainClass.set("edu.vanderbilt.isis.mesolab.product.app.Application")
}

dependencies {
    javaModuleDependencies {
        runtimeOnly(ga("org.slf4j.simple"))
    }
}
