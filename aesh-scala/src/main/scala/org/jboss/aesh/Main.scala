package org.jboss.aesh

import org.jboss.aesh.console._
import org.jboss.aesh.console.command.registry._
import org.jboss.aesh.console.settings._
import org.jboss.aesh.extensions.cat._
import org.jboss.aesh.extensions.cd._
import org.jboss.aesh.extensions.clear._
import org.jboss.aesh.extensions.echo._
import org.jboss.aesh.extensions.exit._
import org.jboss.aesh.extensions.harlem.aesh.Harlem
import org.jboss.aesh.extensions.less.aesh.Less
import org.jboss.aesh.extensions.ls._
import org.jboss.aesh.extensions.matrix._
import org.jboss.aesh.extensions.mkdir._
import org.jboss.aesh.extensions.more.aesh.More
import org.jboss.aesh.extensions.pwd._
import org.jboss.aesh.extensions.rm._
import org.jboss.aesh.extensions.touch._

object Main extends App {

  val sb = new SettingsBuilder();
  sb.readInputrc(false);
  sb.logging(true);

  val acr = new AeshCommandRegistryBuilder();
  acr.commands(classOf[Cd], classOf[Ls], classOf[Mkdir], classOf[Pwd],
    classOf[Rm], classOf[Touch], classOf[Cat], classOf[Clear], classOf[Echo],
    classOf[Less], classOf[More],classOf[Harlem], classOf[Matrix], classOf[Exit]);

  val acb = new AeshConsoleBuilder()
  acb.commandRegistry(acr.create);
  acb.settings(sb.create);
  acb.prompt(new Prompt("[aesh-scala@~]$ "));
  acb.create().start();

}
