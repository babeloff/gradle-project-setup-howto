plugins {
    id("java-library")
    id("de.jjohannes.java-module-testing")
    id("edu.vanderbilt.isis.mesolab.java")
}

javaModuleTesting.blackbox(testing.suites.getByName("test"))
