package org.jboss.aesh;

import org.jboss.aesh.cl.CommandDefinition;
import org.jboss.aesh.console.command.Command;
import org.jboss.aesh.console.command.CommandResult;
import org.jboss.aesh.console.command.invocation.CommandInvocation;

@CommandDefinition(name = "helloworld", description = "")
public class HelloWorldCommand implements Command<CommandInvocation> {

  @Override
  public CommandResult execute(CommandInvocation commandInvocation) {

    commandInvocation.getShell().out().println("Hello World");

    return CommandResult.SUCCESS;

  }

}
