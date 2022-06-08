module edu.vanderbilt.isis.mesolab.product.kamino {
    exports edu.vanderbilt.isis.mesolab.product.kamino;
    requires transitive edu.vanderbilt.isis.mesolab.product.coruscant;
    requires transitive org.jboss.resteasy.core;

    requires org.jboss.resteasy.guice;
    requires org.jboss.resteasy.jackson2.provider;

}
