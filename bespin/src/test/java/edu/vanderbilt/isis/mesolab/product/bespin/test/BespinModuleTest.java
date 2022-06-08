package edu.vanderbilt.isis.mesolab.symcps.bespin.test;

import edu.vanderbilt.isis.mesolab.symcps.corellia.fixtures.CorelliaModuleFixture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BespinModuleTest {

    @Test
    void testModule() {
        assertEquals(3, new CorelliaModuleFixture().threeModules().size());
    }
}
