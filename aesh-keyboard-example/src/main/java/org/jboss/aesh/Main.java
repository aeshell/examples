package org.jboss.aesh;

import org.jboss.aesh.console.AeshConsoleBuilder;

/**
 * @author Helio Frota
 *
 */
public class Main {

    public static void main(String... args) {

        new AeshConsoleBuilder()
            .addCommand(new KeyboardCommand())
            .executeAtStart("keyboard\n")
            .create()
            .start();

    }

}
