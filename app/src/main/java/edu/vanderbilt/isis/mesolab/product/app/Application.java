package edu.vanderbilt.isis.mesolab.symcps.app;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "application",
        mixinStandardHelpOptions = true,
        version = "application 1.0",
        description = "does nothing really")
public class Application implements Callable<Integer> {

    @Parameters(index = "0",
            description = "The file.")
    private File file;

    @Option(names = {"-a", "--algorithm"},
            description = "The algorithm.")
    private String algorithm = "foo";

    @Override
    public Integer call() throws Exception { // your business logic goes here...
        System.out.printf("%s %s %n", file.getAbsolutePath(), algorithm);
        new MainModule().run();
        return 0;
    }

    // this example implements Callable, so parsing, error handling and handling user
    // requests for usage help or version help can be done with one line of code.
    public static void main(String... args) {
        int exitCode = new CommandLine(new Application()).execute(args);
        System.exit(exitCode);
    }
}
