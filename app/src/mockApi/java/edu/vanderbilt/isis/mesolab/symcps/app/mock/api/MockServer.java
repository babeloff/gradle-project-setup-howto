package edu.vanderbilt.isis.mesolab.symcps.app.mock.api;

import com.google.common.collect.ImmutableList;
import edu.vanderbilt.isis.mesolab.symcps.app.MainModule;

public class MockServer {

    public ImmutableList<String> get() {
        new MainModule();
        return ImmutableList.of("a", "b", "x", "y");
    }

}
