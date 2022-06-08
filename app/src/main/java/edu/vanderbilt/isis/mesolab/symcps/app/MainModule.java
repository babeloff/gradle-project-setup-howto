package edu.vanderbilt.isis.mesolab.symcps.app;

import com.google.inject.Guice;
import com.google.inject.servlet.SessionScoped;
import edu.vanderbilt.isis.mesolab.symcps.bespin.BespinModule;
import edu.vanderbilt.isis.mesolab.symcps.kamino.KaminoModule;
import edu.vanderbilt.isis.mesolab.symcps.kashyyyk.KashyyykModule;
import edu.vanderbilt.isis.mesolab.symcps.naboo.NabooModule;
import edu.vanderbilt.isis.mesolab.symcps.tatooine.TatooineModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@SessionScoped
public class MainModule {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainModule.class);

    public void run() throws IOException {
        LOGGER.info("Running application...");

        new BespinModule().doThings();
        new KaminoModule();
        new KashyyykModule();
        new NabooModule();
        new TatooineModule();

        Guice.createInjector();
    }
}
