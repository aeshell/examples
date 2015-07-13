package org.jboss.aesh;

import java.io.IOException;

import org.jboss.aesh.cl.CommandDefinition;
import org.jboss.aesh.console.command.Command;
import org.jboss.aesh.console.command.CommandOperation;
import org.jboss.aesh.console.command.CommandResult;
import org.jboss.aesh.console.command.invocation.CommandInvocation;
import org.jboss.aesh.terminal.Key;
import org.jboss.aesh.terminal.Shell;
import org.jboss.aesh.util.ANSI;

/**
 * @author Helio Frota
 *
 */
@CommandDefinition(name = "keyboard", description = "")
public class KeyboardCommand implements Command<CommandInvocation> {

    @Override
    public CommandResult execute(final CommandInvocation ci) throws IOException, InterruptedException {

        Shell shell = ci.getShell();
        shell.clear();
        shell.out().print(ANSI.CURSOR_HIDE);
        shell.enableAlternateBuffer();

        Thread t = new Thread(new Runnable() {

            public void run() {

                while (true) {

                    CommandOperation co = null;
                    try {
                        co = ci.getInput();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (co.getInputKey() == Key.k) {
                        shell.out().print("k\n");
                    }
                    else if (co.getInputKey() == Key.j) {
                        shell.out().print("j\n");
                    }
                    else if (co.getInputKey() == Key.h) {
                        shell.out().print("h\n");
                    }
                    else if (co.getInputKey() == Key.l) {
                        shell.out().print("l\n");
                    }
                    else if (co.getInputKey() == Key.q || co.getInputKey() == Key.ESC) {
                        break;
                    }
                }
            }
        });
        
        t.start();
        t.join();

        shell.clear();
        shell.enableMainBuffer();
        
        shell.out().print(ANSI.CURSOR_SHOW);
        ci.stop();
        
        return CommandResult.SUCCESS;
    }

}
