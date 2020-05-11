name := """products"""
organization := "com.canessasoft"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "net.sf.barcode4j" % "barcode4j" % "2.0"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.canessasoft.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.canessasoft.binders._"
