package edu.vanderbilt.isis.mesolab.product.app.mock.api;

import com.google.common.collect.ImmutableList;
import edu.vanderbilt.isis.mesolab.product.app.MainModule;

public class MockServer {

    public ImmutableList<String> get() {
        new MainModule();
        return ImmutableList.of("a", "b", "x", "y");
    }

}
