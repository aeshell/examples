package org.jboss.aesh;

import org.jboss.aesh.console.AeshConsoleBuilder;

public class Main {

  public static void main(String... args) {

    new AeshConsoleBuilder()
      .addCommand(new HelloWorldCommand())
      .executeAtStart("helloworld\n")
      .create()
      .start();

  }

}
