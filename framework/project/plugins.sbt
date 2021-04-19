// Copyright (C) 2009-2013 Typesafe Inc. <http://www.typesafe.com>

logLevel := Level.Warn

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.0.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.0")

libraryDependencies <+= sbtVersion { sv =>
  "org.scala-sbt" % "scripted-plugin" % sv
}

libraryDependencies += "org.webjars" % "webjars-locator" % "0.12"

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.5.0")
