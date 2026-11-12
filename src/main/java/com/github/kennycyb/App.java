package com.github.kennycyb;

import picocli.CommandLine;
import picocli.CommandLine.Command;

/**
 * Hello world!
 *
 */
@Command(
    name = "java-sandbox",
    description = "Java Sandbox",
    mixinStandardHelpOptions = true,
    subcommands = CommandLine.HelpCommand.class
)
public class App 
    implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Hello World!");
    }

    public static void main(String[] args)
    {
        System.exit(new CommandLine(new App()).execute(args));
    }
}
