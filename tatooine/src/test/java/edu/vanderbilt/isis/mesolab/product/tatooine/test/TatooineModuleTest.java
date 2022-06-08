package edu.vanderbilt.isis.mesolab.symcps.tatooine.test;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TatooineModuleTest {

    @Test
    public void testModule() {
        assertSame("Junit4", "Junit" + (2 + 2));
    }
}
