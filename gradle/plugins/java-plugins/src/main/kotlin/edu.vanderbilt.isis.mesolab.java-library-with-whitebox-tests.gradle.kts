plugins {
    id("java-library")
    id("de.jjohannes.java-module-testing")
    id("edu.vanderbilt.isis.mesolab.java")
}

javaModuleTesting.whitebox(testing.suites["test"]) {
    requires.add("org.junit.jupiter.api")
    opensTo.add("org.junit.platform.commons")
}
