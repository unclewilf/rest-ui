organization := "com.rest"

name := "Rest UI"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.3"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

seq(webSettings :_*)

classpathTypes ~= (_ + "orbit")

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.2.2",
  "org.scalatra" %% "scalatra-scalate" % "2.2.2",
  "org.scalatra" %% "scalatra-specs2" % "2.2.2" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.13" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.10.v20130312" % "container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar")),
  "javax.servlet" % "servlet-api" % "2.4" % "provided"
)
