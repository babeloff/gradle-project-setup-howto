module org.example.product.app {
    exports org.example.product.app;

    requires org.example.product.bespin;
    requires org.example.product.corellia;
    requires org.example.product.kamino;
    requires org.example.product.kashyyyk;
    requires org.example.product.naboo;
    requires org.example.product.tatooine;

    // https://github.com/decorators-squad/eo-yaml/blob/master/src/main/java9/module-info.java
    requires com.amihaiemil.eoyaml;
    requires com.google.guice;
    requires com.google.guice.extensions.servlet;
    // https://github.com/remkop/picocli/blob/main/src/main/java9/module-info.java
    requires info.picocli;
    requires java.servlet;
    requires org.slf4j;

}
