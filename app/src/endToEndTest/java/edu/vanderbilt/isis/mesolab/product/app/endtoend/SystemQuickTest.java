package edu.vanderbilt.isis.mesolab.symcps.app.endtoend;

import com.google.common.collect.ImmutableList;
import edu.vanderbilt.isis.mesolab.symcps.app.mock.api.MockServer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemQuickTest {

    @Test
    void testSome() {
        assertEquals(0, sendStuff(new MockServer().get()));
    }

    private int sendStuff(ImmutableList<String> things) {
        return 0;
    }
}
