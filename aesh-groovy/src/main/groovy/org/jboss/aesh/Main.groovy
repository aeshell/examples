package org.jboss.aesh

import org.jboss.aesh.console.AeshConsoleBuilder
import org.jboss.aesh.console.Prompt
import org.jboss.aesh.console.command.registry.AeshCommandRegistryBuilder
import org.jboss.aesh.console.settings.SettingsBuilder
import org.jboss.aesh.extensions.cat.Cat
import org.jboss.aesh.extensions.cd.Cd
import org.jboss.aesh.extensions.clear.Clear
import org.jboss.aesh.extensions.echo.Echo
import org.jboss.aesh.extensions.exit.Exit
import org.jboss.aesh.extensions.harlem.aesh.Harlem
import org.jboss.aesh.extensions.less.aesh.Less
import org.jboss.aesh.extensions.ls.Ls
import org.jboss.aesh.extensions.matrix.Matrix
import org.jboss.aesh.extensions.mkdir.Mkdir
import org.jboss.aesh.extensions.more.aesh.More
import org.jboss.aesh.extensions.pwd.Pwd
import org.jboss.aesh.extensions.rm.Rm
import org.jboss.aesh.extensions.touch.Touch

class Main {

  static main(args) {

    def sb = new SettingsBuilder().readInputrc(false).logging(true)

    def acrb = new AeshCommandRegistryBuilder()
    acrb.commands(Cd, Ls, Mkdir, Pwd, Rm, Touch, Cat, Clear, Echo, Less,
                  More, Harlem, Matrix, Exit)

    def acb = new AeshConsoleBuilder()
    acb.commandRegistry(acrb.create())
    acb.settings(sb.create())
    acb.prompt(new Prompt('[aesh-groovy@~]$ '))
    acb.create().start()

  }
}
