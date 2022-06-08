module edu.vanderbilt.isis.mesolab.symcps.app {
    exports edu.vanderbilt.isis.mesolab.symcps.app;

    requires edu.vanderbilt.isis.mesolab.symcps.bespin;
    requires edu.vanderbilt.isis.mesolab.symcps.corellia;
    requires edu.vanderbilt.isis.mesolab.symcps.kamino;
    requires edu.vanderbilt.isis.mesolab.symcps.kashyyyk;
    requires edu.vanderbilt.isis.mesolab.symcps.naboo;
    requires edu.vanderbilt.isis.mesolab.symcps.tatooine;

    // https://github.com/decorators-squad/eo-yaml/blob/master/src/main/java9/module-info.java
//    requires com.amihaiemil.eoyaml;
    requires com.google.guice;
    requires com.google.guice.extensions.servlet;
    // https://github.com/remkop/picocli/blob/main/src/main/java9/module-info.java
    requires info.picocli;
    requires java.servlet;
    requires org.slf4j;

}
