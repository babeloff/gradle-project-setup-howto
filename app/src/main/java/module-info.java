module edu.vanderbilt.isis.mesolab.product.app {
    exports edu.vanderbilt.isis.mesolab.product.app;

    requires edu.vanderbilt.isis.mesolab.product.bespin;
    requires edu.vanderbilt.isis.mesolab.product.corellia;
    requires edu.vanderbilt.isis.mesolab.product.kamino;
    requires edu.vanderbilt.isis.mesolab.product.kashyyyk;
    requires edu.vanderbilt.isis.mesolab.product.naboo;
    requires edu.vanderbilt.isis.mesolab.product.tatooine;

    // https://github.com/decorators-squad/eo-yaml/blob/master/src/main/java9/module-info.java
//    requires com.amihaiemil.eoyaml;
    requires com.google.guice;
    requires com.google.guice.extensions.servlet;
    // https://github.com/remkop/picocli/blob/main/src/main/java9/module-info.java
    requires info.picocli;
    requires java.servlet;
    requires org.slf4j;

}
