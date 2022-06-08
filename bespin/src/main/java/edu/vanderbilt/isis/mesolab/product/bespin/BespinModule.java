package edu.vanderbilt.isis.mesolab.product.bespin;

import edu.vanderbilt.isis.mesolab.product.corellia.CorelliaModule;
import edu.vanderbilt.isis.mesolab.product.coruscant.CoruscantModule;
import org.apache.velocity.io.VelocityWriter;

import java.io.FileWriter;
import java.io.IOException;

public class BespinModule {

    public CorelliaModule doThings() throws IOException {
        new CoruscantModule();
        new VelocityWriter(new FileWriter(System.getProperty("java.io.tmpdir") + "/dummy.out"));
        return new CorelliaModule();
    }
}
