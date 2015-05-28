name := "aesh-scala"

version := "0.59"

scalaVersion := "2.11.0"

exportJars := true

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq (
  "org.jboss.aesh" % "aesh" % "0.59",
  "org.jboss.aesh" % "aesh-extensions" % "0.59"
)

