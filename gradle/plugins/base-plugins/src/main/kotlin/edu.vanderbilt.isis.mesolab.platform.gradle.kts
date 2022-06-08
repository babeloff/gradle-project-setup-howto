plugins {
    id("java-platform")
    id("edu.vanderbilt.isis.mesolab.base")
}

// Depend on other Platforms/BOMs to align versions for libraries that consist of multiple components (like Jackson)
javaPlatform.allowDependencies()
