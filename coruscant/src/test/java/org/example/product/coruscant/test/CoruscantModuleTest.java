package org.example.product.coruscant.test;

import org.example.product.coruscant.CoruscantModule;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.assertj.core.api.Assertions.assertThat;

public class CoruscantModuleTest {

    @Test
    void testCoruscantModule() throws IOException {
        assertThat(new CoruscantModule()).isNotEqualTo(null);

        try(InputStream hello = CoruscantModuleTest.class.getResourceAsStream("testHello.txt")) {
            String message = new BufferedReader(new InputStreamReader(hello)).readLine();
            assertThat(message).isEqualTo("TEST HELLO!");
        }
    }
}
