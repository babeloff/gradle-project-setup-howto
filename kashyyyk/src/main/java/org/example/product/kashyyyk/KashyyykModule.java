package edu.vanderbilt.isis.mesolab.product.kashyyyk;

import edu.vanderbilt.isis.mesolab.product.bespin.BespinModule;
import edu.vanderbilt.isis.mesolab.product.kamino.KaminoModule;
import edu.vanderbilt.isis.mesolab.product.naboo.NabooModule;
import edu.vanderbilt.isis.mesolab.product.tatooine.TatooineModule;

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
