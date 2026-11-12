package com.github.kennycyb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import picocli.CommandLine;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Verify the help command prints the root command usage.
     */
    @Test
    public void helpCommandDisplaysUsage()
    {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        CommandLine commandLine = new CommandLine(new App());
        commandLine.setOut(new PrintWriter(output));

        assertEquals(0, commandLine.execute("help"));
        assertTrue(output.toString().contains("Usage: java-sandbox"));
    }
}
