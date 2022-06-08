package edu.vanderbilt.isis.mesolab.symcps.kashyyyk;

import edu.vanderbilt.isis.mesolab.symcps.bespin.BespinModule;
import edu.vanderbilt.isis.mesolab.symcps.kamino.KaminoModule;
import edu.vanderbilt.isis.mesolab.symcps.naboo.NabooModule;
import edu.vanderbilt.isis.mesolab.symcps.tatooine.TatooineModule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KashyyykModule {

    public KashyyykModule() {
        try(InputStream hello = KashyyykModule.class.getResourceAsStream("hello.txt")) {
            String message = new BufferedReader(new InputStreamReader(hello)).readLine();
            System.out.println(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public NabooModule flyTo(TatooineModule from) {
        new KaminoModule();
        new BespinModule();
        int a = calculateSomethingImportant();
        return new NabooModule(a);
    }

    int calculateSomethingImportant() {
        return 4 + 1;
    }
}
