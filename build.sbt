resolvers += Resolver.mavenLocal
resolvers += "Mobile Mind" at "https://raw.githubusercontent.com/mobilemindtech/m2/master"

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "jQuery Facade"

normalizedName := "jquery-facade"

version := "2.2"

organization := "org.querki"

scalaVersion := "3.7.4"

ThisBuild / scalacOptions ++= Seq("-feature", "-deprecation")

libraryDependencies ++= Seq(
  "org.querki" %%% "querki-jsext" % "0.13",
  "org.scala-js" %%% "scalajs-dom" % "2.8.1"
)
